package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_fetching {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(1000);
		String text = driver.findElement(By.xpath("//div[@class='style_headermenuContent__Rk11W header']")).getText();
		System.out.println(text);
		Thread.sleep(1000);
		driver.quit();
		
	}

}
