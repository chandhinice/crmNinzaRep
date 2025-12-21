package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSurrounding {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//label[.='Poor']/..//input[@type='radio']")).click();
	    Thread.sleep(1000);
	   // driver.quit();
	    

	}

}
