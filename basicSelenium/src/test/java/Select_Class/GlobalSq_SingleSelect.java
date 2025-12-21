package Select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GlobalSq_SingleSelect {9

	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	      Thread.sleep(1000);
	     WebElement ref = driver.findElement(By.xpath("//div[@rel-title='Select Country']/descendant::select"));
	     ref.click();
	     Select cntry=new Select(ref);
	     cntry.selectByValue("IND");
	     Thread.sleep(2000);
	     cntry.deselectByValue("IND");
	     
	}

}
