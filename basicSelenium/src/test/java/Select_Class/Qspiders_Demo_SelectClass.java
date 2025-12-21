package Select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Qspiders_Demo_SelectClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
	      Thread.sleep(1000);
	      WebElement ref = driver.findElement(By.id("select3"));
	      ref.click();
	      Select ele =new Select(ref);
	      Thread.sleep(1000);
	      ele.selectByValue("India");
	      Thread.sleep(1000);
	      WebElement state = driver.findElement(By.id("select5"));
	      Select name=new Select(state);
	      name.selectByIndex(17);
	      Thread.sleep(1000);
	      WebElement city = driver.findElement(By.xpath("(//select[@class='border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150'])[3]"));
	       city.click();
	       Thread.sleep(1000);
	       Select place=new Select(city);
	       place.selectByVisibleText("Bangalore Urban");
	}
	

}
