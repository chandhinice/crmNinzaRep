package NinzaCRM;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.json.Json;
import org.openqa.selenium.json.JsonInput;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;

public class NInzaCRM_Jsonfiles {

	private static JsonElement obj;

	public static void main(String[] args) throws IOException, InterruptedException {
		
		  WebDriver driver=null;
		  FileInputStream fis=new FileInputStream("./src/test/resources/common.properties");
		  Properties
		  pobj=new Properties(); pobj.load(fis); String Url = pobj.getProperty("url");
		  String Username=pobj.getProperty("username"); String
		  Password=pobj.getProperty("password");
		  
		  String BROWSER=pobj.getProperty("browser"); if(BROWSER.equals("chrome")) {
		  driver=new ChromeDriver(); } else if(BROWSER.equals("edge")) { driver=new
		  EdgeDriver();
		  
		  } driver.get(Url); driver.manage().window().maximize();
		  driver.findElement(By.id("username")).sendKeys(Username);
		  driver.findElement(By.id("inputPassword")).sendKeys(Password);
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//span[.='Create Contact']")).click();
		  fis.close(); //FileReader fr= new
		  JsonParser parser = new JsonParser();

		Object obj = parser.parse(new FileReader("./src/test/resources/Contact.json"));
		JsonObject data = (JsonObject) obj;
		Object CONTACTNAME = data.get("contactname");
		Object ORGANIZATION=data.get("organization");
		Object TITLE=data.get("title");
		//driver.findElement(By.)
		

	}

}
