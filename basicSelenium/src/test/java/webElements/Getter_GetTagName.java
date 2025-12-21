+*package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getter_GetTagName {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(1000);
		String tag = driver.findElement(By.xpath("//input[@type='text']")).getTagName();
		//System.out.println(tag);
		if(tag.equals("input"))
			System.out.println("correct output");
		else
			System.out.println("incorrect");
		Thread.sleep(1000);
		driver.quit();		
		
		
		

	}

}
