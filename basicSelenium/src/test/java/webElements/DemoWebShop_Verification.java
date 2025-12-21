package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop_Verification {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	      driver.get("https://demowebshop.tricentis.com/");
	      Thread.sleep(1000);
	         WebElement ref = driver.findElement(By.id("pollanswers-3"));
	         System.out.println(ref.isSelected());
	         ref.click();
	         System.out.println(ref.isSelected());
		     driver.quit();
			
		      
	}

}
