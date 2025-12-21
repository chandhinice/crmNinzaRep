package MultipleWebEle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_NonInspectable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Puma");
		Thread.sleep(1000);
		List<WebElement> ref = driver.findElements(By.xpath("//li[@class='_3D0G9a']"));
		for (WebElement shoes : ref) {
			
			System.out.println(shoes.getText());
		}
	}
	

}
