package Assesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

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
		Thread.sleep(5000);
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		Thread.sleep(2000);
		String songname = driver.findElement(By.xpath("(//yt-formatted-string[starts-with(@title,'Neeli')])[1]")).getText();
		System.out.println(songname);
		driver.quit();
	    }

	

}
