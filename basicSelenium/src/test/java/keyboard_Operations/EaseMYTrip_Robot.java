package keyboard_Operations;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EaseMYTrip_Robot {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(2000);
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_ESCAPE);
		robo.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(3000);
		robo.keyPress(KeyEvent.VK_ESCAPE);
		robo.keyRelease(KeyEvent.VK_ESCAPE);		
		
		
	}

}
