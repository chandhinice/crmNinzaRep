package Select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect_Downloaded {

	
		public static void main(String[] args) throws InterruptedException {
		      WebDriver  driver=new ChromeDriver();
		      driver.manage().window().maximize();
		      driver.get("file:///C:/Users/hp/Downloads/selectclass.html");
		      Thread.sleep(1000);
		      WebElement ref = driver.findElement(By.id("multiple-cars"));
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
				dropdown.selectByValue("vol");
				//selecting by visible text
				Thread.sleep(1000);
				dropdown.selectByVisibleText(" Mercedes ");
				Thread.sleep(2000);
				dropdown.deselectAll();
				Thread.sleep(2000);
				dropdown.isMultiple();
				System.out.println(dropdown.isMultiple());
				driver.quit();
	}
}
