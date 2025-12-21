package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDOm_Property {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://demowebshop.tricentis.com/");
	      Thread.sleep(1000);
	     WebElement ref = driver.findElement(By.id("small-searchterms"));
	     System.out.println(ref.getDomAttribute("value"));
	     System.out.println(ref.getDomProperty("value"));
	     Thread.sleep(1000);
	     ref.sendKeys("Laptop");
	     System.out.println(ref.getDomAttribute("value"));
	     System.out.println(ref.getDomProperty("value"));
	     Thread.sleep(1000);
	     driver.quit();
	}

}
