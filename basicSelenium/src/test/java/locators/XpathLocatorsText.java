package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocatorsText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Mobile Recharge']")).click();
		Thread.sleep(1000);
		driver.quit();

	}

}
