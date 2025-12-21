package webdriver_methods;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AAsignment {

	public static void main(String[] args) throws InterruptedException { 
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		
		    driver.manage().window().setPosition(new Point(11,15));
		    driver.get("https://www.flipkart.in/");
		    driver.navigate().back();
		    Thread.sleep(1000);
		    driver.navigate().refresh();
		    
		

	}

}
