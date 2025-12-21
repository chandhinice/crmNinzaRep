package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation_PopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("chandhini");
		driver.findElement(By.name("submit")).click();
		Alert handle = driver.switchTo().alert();
		System.out.println(handle.getText());
		handle.accept();
		Thread.sleep(1000);
		//System.out.println(handle.getText());
		handle.accept();
	}

}
