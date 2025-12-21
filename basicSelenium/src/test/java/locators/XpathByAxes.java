package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://demowebshop.tricentis.com/");
	       Thread.sleep(1000);
	       driver.findElement(By.xpath("//input[@type='submit']/preceding-sibling::input")).sendKeys("Laptop");
	       Thread.sleep(1000);
	       driver.findElement(By.xpath("//input[@value='Subscribe']/parent::div/preceding-sibling::div/child::input")).sendKeys("Test@gmail.com");
	       Thread.sleep(1000);
	       driver.quit();
	}

}
