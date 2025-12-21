package keyboard_Operations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop_KBO {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(1000);
		WebElement loc = driver.findElement(By.id("FirstName"));
		loc.sendKeys("TestEng",Keys.TAB,"123456",Keys.TAB,"test321@gmail.com",Keys.TAB,"97409134",Keys.TAB,"97409134",Keys.TAB,Keys.ENTER);
		
		
	}

}
