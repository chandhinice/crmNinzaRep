package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoodleGoogle_ScrollTo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://doodles.google/");
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//using ScrollTo
		js.executeScript("window.scrollTo(0,800)");
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,1200)");
	}

}
