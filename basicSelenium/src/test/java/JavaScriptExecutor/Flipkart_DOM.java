package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_DOM {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");

	}

}
