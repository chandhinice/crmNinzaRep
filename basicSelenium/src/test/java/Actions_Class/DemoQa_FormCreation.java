package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoQa_FormCreation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://demoqa.com/select-menu");
	      Thread.sleep(1000);
	      Actions action=new Actions(driver);
	      driver.findElement(By.xpath("(//div[@class='element-group'])[1]")).click();
	      Thread.sleep(5000);
	      driver.findElement(By.xpath("//span[.='Text Box']")).click();
	      Thread.sleep(2000);
	      WebElement ref = driver.findElement(By.id("userName"));
	      ref.sendKeys("Chandhini",Keys.TAB,"test123@gmail.com",Keys.TAB,"Gandhi bazar",Keys.TAB,Keys.TAB,Keys.ENTER);
	      Thread.sleep(2000);
	      String info = driver.findElement(By.id("output")).getText();
	      System.out.println(info);
	      }

}
