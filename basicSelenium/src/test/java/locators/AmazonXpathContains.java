package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXpathContains {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(.,'Deals')]")).click();
	}

}
