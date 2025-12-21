package iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3Schools_FrameIndex {

	public static void main(String[] args) {
		

		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		        driver.get("");
		        driver.switchTo().frame("iframeResult") ;
		        WebElement heading = driver.findElement(By.xpath("//h1"));
		        System.out.println("Heading inside iframe: " + heading.getText());
		        driver.switchTo().defaultContent();
		        
		        driver.quit();
		    }
	

	}

