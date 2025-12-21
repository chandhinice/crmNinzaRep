package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Internect_Herokuapp_ActionClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chandhini:chandhu11@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		
	}

}
