package Actions_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoWebShop_ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		Actions action= new Actions(driver);
		Thread.sleep(3000);
		action.moveByOffset(487, 187).perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
