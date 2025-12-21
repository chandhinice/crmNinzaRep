package MultipleWebEle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bigbasket_AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.bigbasket.com/");
       Thread.sleep(1000);
       driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Apple");
       Thread.sleep(1000);
       List<WebElement> ref = driver.findElements(By.xpath("//a[contains(@class,'QuickSearch___StyledLink')]"));
    		   for (WebElement fruit : ref) {
				 System.out.println(fruit.getText());
			}
    		   driver.quit();
       }

}
