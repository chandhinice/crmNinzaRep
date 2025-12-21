package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathattribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://frameskraft.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Frames");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='button'and @class='btn searchBtn']")).click();
		Thread.sleep(1000);
		driver.quit();

	}

}
