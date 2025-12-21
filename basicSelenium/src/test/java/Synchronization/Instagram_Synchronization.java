package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Instagram_Synchronization {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Test23");
		 driver.findElement(By.name("password")).sendKeys("1234");
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
//		wait.until(ExpectedConditions.alertIsPresent());
		WebElement ref = driver.findElement(By.xpath("//button[@type='submit']"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(ref));
		ref.click();
		}

}
