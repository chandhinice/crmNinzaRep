package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_ScrollBy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		driver.quit();
		js.executeScript("window.scrollTo(0,800)");
	}

}
