package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram_DomAttribute_Property {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		WebElement text = driver.findElement(By.id("email"));
		System.out.println(text.getDomAttribute("value"));
		System.out.println(text.getDomProperty("value"));
		text.sendKeys("chandhini");
		System.out.println(text.getDomAttribute("value"));
		System.out.println(text.getDomProperty("value"));
		text.clear();
		System.out.println(text.getDomAttribute("value"));
		System.out.println(text.getDomProperty("value"));
		System.out.println("yes");
		driver.quit();
		
		
		
	}

}
