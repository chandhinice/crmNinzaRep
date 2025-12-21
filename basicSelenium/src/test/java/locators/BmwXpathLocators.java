package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BmwXpathLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.bmw.in/en/index.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='cmp-button__text']")).click();

}

}
