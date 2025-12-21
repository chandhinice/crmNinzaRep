package keyboard_Operations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_loginPage_KBO {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(1000);
		WebElement ref = driver.findElement(By.name("firstname"));
		ref.sendKeys("Chandhudhini",Keys.TAB,"Chand345");
		Thread.sleep(1000);
		WebElement Day = driver.findElement(By.id("day"));
		Day.click();
		Day.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.DOWN);
		Thread.sleep(1000);
		WebElement Month = driver.findElement(By.id("month"));
		Month.click();
		Month.sendKeys(Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP);
		Thread.sleep(1000);
		WebElement year = driver.findElement(By.id("year"));
		year.click();
		year.sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.id("sex")).click();
		WebElement num = driver.findElement(By.name("reg_email__"));
		num.sendKeys("9686341687",Keys.TAB,"89764590");
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(3000);
		driver.quit();
		

	}

}
