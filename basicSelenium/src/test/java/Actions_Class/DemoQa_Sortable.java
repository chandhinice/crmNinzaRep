package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoQa_Sortable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://demoqa.com/select-menu");
	      Thread.sleep(1000);
	      Actions action=new Actions(driver);
	      Thread.sleep(3000);
	      WebElement inter = driver.findElement(By.xpath("(//div[@class='header-wrapper'])[5]"));
	      action.click(inter).perform();
	      Thread.sleep(3000);
	      WebElement ref = driver.findElement(By.xpath("//span[.='Sortable']"));
	      Thread.sleep(3000);
	      action.click(ref).perform();
	      Thread.sleep(3000);
	      WebElement ref2 = driver.findElement(By.xpath("//a[.='Grid']"));
	      Thread.sleep(3000);
	      action.click(ref2).perform();
	      
	      
	      Thread.sleep(3000);
	      WebElement ref3 = driver.findElement(By.xpath("(//div[.='One'])[2]"));
	      WebElement ref4 = driver.findElement(By.xpath("//div[.='Eight']"));
	      action.dragAndDrop(ref3, ref4).perform();
	      Thread.sleep(3000);
	      driver.quit();

}
}
