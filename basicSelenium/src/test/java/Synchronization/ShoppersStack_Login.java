package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppersStack_Login {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://shoppersstack.com/");
		driver.findElement(By.xpath("//button[.='Login']")).click();
		WebElement ref = driver.findElement(By.id("Email"));
		ref.sendKeys("chandhinice@gmail.com",Keys.TAB,"Chandhini@11",Keys.TAB,Keys.TAB,Keys.ENTER);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0.1500)");
		driver.findElement(By.xpath("//span[.='APPLE iPhone 13 Pro max']/../../..//button[@id=\"addToCart\"]")).click();
	}

}
