package Select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoQa_MultipleSelectClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://demoqa.com/select-menu");
	      Thread.sleep(1000);
	      WebElement ref = driver.findElement(By.id("cars"));
	      ref.click();
	      Select dropdown = new Select(ref);
	      //fetch all the options available in DropDown
	       List<WebElement> res = dropdown.getOptions();
	       for (WebElement ele : res) {
	    	   System.out.println(ele.getText());
			
		}
	       //selecting by index
	      Thread.sleep(1000);
			dropdown.selectByIndex(1);
			//selecting by value
			Thread.sleep(1000);
			dropdown.selectByValue("opel");
			//selecting by visible text
			Thread.sleep(1000);
			dropdown.selectByVisibleText(" Audi ");
			//fetch the first selected element
			Thread.sleep(1000);
			dropdown.deselectByValue("opel");
			Thread.sleep(1000);
			//fetch all the selected options
			List<WebElement> selectedlist = dropdown.getAllSelectedOptions();
			for (WebElement webElement : selectedlist) {
				
				System.out.println(webElement.getText());
			}
			dropdown.isMultiple();
			driver.quit();
		
			
	
	}

}
