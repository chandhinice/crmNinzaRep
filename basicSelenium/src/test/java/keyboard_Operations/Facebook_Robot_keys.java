package keyboard_Operations;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Robot_keys {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(1000);
		WebElement Day = driver.findElement(By.id("day"));
		Day.click();
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);		
		
	}

}
