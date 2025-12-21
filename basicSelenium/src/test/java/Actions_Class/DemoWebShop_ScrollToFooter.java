package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoWebShop_ScrollToFooter {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement ref = driver.findElement(By.linkText("YouTube"));
		Actions action= new Actions(driver);
		Thread.sleep(2000);
		action.scrollByAmount(6000, 0).perform();
		Thread.sleep(2000);
		action.click(ref).perform();
	}

}
