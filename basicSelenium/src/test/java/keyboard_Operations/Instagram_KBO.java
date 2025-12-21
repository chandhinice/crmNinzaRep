package keyboard_Operations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram_KBO {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(1000);
		WebElement ref = driver.findElement(By.name("username"));
		ref.sendKeys("Test123",Keys.CONTROL+"a");
		ref.sendKeys(Keys.CONTROL+"c");
		ref.sendKeys(Keys.TAB,Keys.CONTROL+"v");
	}

}
