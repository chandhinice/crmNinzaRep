package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_ActionClass_Scrollmethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement ref = driver.findElement(By.linkText("Help"));
		Actions action=new Actions(driver);
		action.scrollByAmount(0, 8000).perform();
		Thread.sleep(2000);
		action.click(ref).perform();
		
	}

}


