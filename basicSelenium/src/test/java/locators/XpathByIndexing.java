package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndexing {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.amazon.in/");
	       Thread.sleep(1000);
	       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
	       driver.findElement(By.id("nav-search-submit-button")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//span[.='Campus']/..//i")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("(//span[contains(.,'Tomorrow')])[3]//i")).click();
	}

}
