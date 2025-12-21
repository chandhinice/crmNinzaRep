package NinzaCRM;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Campiagns {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--ash-hide-notifications-for-factory ⊗	");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//launch NonzaCRM,
		driver.get("http://49.249.28.218:8098/campaigns");
		Thread.sleep(2000);
		WebElement ref = driver.findElement(By.id("username"));
		Thread.sleep(2000);
		ref.sendKeys("rmgyantra",Keys.TAB,"rmgy@9999",Keys.TAB,Keys.ENTER);
		WebElement list = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select drpdwn=new Select(list);
		Thread.sleep(2000);
		drpdwn.selectByIndex(1);
		//to sear by campaign name
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mnbl");
		Thread.sleep(2000);
		for(;;)
		{
			try {
				driver.findElement(By.xpath("//td[.='mnbl']")).click();
				break;
				
			}
			catch (Exception e) {
				driver.findElement(By.xpath("//a[@aria-label='Go to next page']")).click();
			}
		}
		Thread.sleep(10000);

		driver.findElement(By.xpath("(//i[@title='Edit'])[4]")).click();
		WebElement date = driver.findElement(By.xpath("//input[@name='expectedCloseDate']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].valu='15'",date);
		Thread.sleep(10000);

		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		Thread.sleep(10000);
	}

}
