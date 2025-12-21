package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXpathLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.amazon.in/");
	       Thread.sleep(1000);
	       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Tv");
	       Thread.sleep(500);
	       driver.findElement(By.xpath("//input[@type='submit']")).click();
	       Thread.sleep(500);
	       driver.findElement(By.name("submit.addToCart")).click();
	       
	       
	}

}
