package MultipleWebEle;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_suggestions_inspecting {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("raghavendra");
		Thread.sleep(1000);
		 List<WebElement> ref = driver.findElements(By.xpath("//div[@role='presentation']"));
		 for (WebElement youtube : ref) {
			 
			 System.out.println(youtube.getText());
			
		}
	}

}
