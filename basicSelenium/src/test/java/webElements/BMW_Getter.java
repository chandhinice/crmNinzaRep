package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BMW_Getter {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bmw.in/");
		Thread.sleep(1000);
		WebElement ref = driver.findElement(By.xpath("//button[@data-button-id='myBmw']"));
		System.out.println(ref.getAriaRole());
		System.out.println(ref.getAccessibleName());
		driver.quit();
		
	}
	

}
