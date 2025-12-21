package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Surroundings_Xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Good']/..//input[@type='radio']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
	}

}
