package webElements;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchAttribute_WebShop {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
         @Nullable
		String value = driver.findElement(By.tagName("input")).getAttribute("type");
         Thread.sleep(1000); 
         System.out.println(value);
         driver.quit();
	}

}
