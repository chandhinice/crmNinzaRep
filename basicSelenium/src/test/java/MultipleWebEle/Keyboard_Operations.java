package MultipleWebEle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard_Operations {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.saucedemo.com/v1/index.html");
     Thread.sleep(1000);
     driver.findElement(By.id("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
     Thread.sleep(2000);
     driver.quit();
	}

}
