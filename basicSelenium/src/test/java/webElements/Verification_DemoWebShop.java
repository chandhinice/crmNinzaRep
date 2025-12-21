package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification_DemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://demowebshop.tricentis.com/");
	      Thread.sleep(1000);
//	     WebElement display = driver.findElement(By.id("small-searchterms"));
//	     System.out.println(display.isDisplayed());
//	     display.click();
//	     System.out.println(display.isDisplayed());
	      WebElement disp = driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]"));
	      System.out.println(disp.isDisplayed());
	      disp.click();
	      System.out.println(disp.isDisplayed());
	      //Thread.sleep(1000);
	       driver.quit();

	}

}
