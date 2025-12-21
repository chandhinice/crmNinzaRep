package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathMultiple {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='search_query'and @class='ytSearchboxComponentInput yt-searchbox-input title']")).sendKeys("neelimeghamulao");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@title='Search']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='video-title']")).click();
		Thread.sleep(3000);
		driver.quit();
	    }

}
