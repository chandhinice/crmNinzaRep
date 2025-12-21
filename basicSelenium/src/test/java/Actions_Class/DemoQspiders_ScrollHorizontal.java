package Actions_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoQspiders_ScrollHorizontal {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		Thread.sleep(1000);
		Actions action= new Actions(driver);
		Thread.sleep(2000);
		action.scrollByAmount(714, 359).perform();

	}

}
