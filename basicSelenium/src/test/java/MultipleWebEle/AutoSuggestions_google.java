package MultipleWebEle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions_google {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
	     driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Gold Price");
	     Thread.sleep(1000);
	     List<WebElement> suggest = driver.findElements(By.xpath("//div[@role='presentation']"));
	     for (WebElement text : suggest) {
	    	  System.out.println(text.getText());
			
		}
	     
	}

}
