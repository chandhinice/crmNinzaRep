package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQa_PopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scollBy(document.body.scrollHeight)");
		WebElement ref = driver.findElement(By.id("promtButton"));
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.elementToBeClickable(ref));
		ref.click();
		Alert handle = driver.switchTo().alert();
		handle.sendKeys("TestEng");
		handle.accept();
	}

}
