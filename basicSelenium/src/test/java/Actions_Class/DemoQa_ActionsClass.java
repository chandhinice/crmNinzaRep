package Actions_Class;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoQa_ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://demoqa.com/select-menu");
	      Thread.sleep(1000);
	      Actions action=new Actions(driver);
	      action.moveByOffset(190, 199).click().build();
	      Thread.sleep(5000);
	      //action.moveByOffset(444, 287).click().perform();
	      WebElement ref = driver.findElement(By.id("item-4"));
	      Thread.sleep(2000);
	      action.moveToElement(ref).click().build();
	      Thread.sleep(2000);
	      WebElement ref2 = driver.findElement(By.id("doubleClickBtn"));
	      action.doubleClick(ref2).build();
	      
	}

}
