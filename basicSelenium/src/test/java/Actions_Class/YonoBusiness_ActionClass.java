package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YonoBusiness_ActionClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://yonobusiness.sbi.bank.in/yonobusinesslogin");
		Thread.sleep(1000);
		WebElement ref = driver.findElement(By.id("password"));
		WebElement ref1 = driver.findElement(By.xpath("//button[@tabindex='0']"));
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		action.moveToElement(ref).click().sendKeys("123456").perform();
		Thread.sleep(3000);
		action.clickAndHold(ref1).perform();
		Thread.sleep(3000);
		action.release(ref1).perform();
	}
	
}
