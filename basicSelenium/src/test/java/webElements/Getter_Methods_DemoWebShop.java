package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getter_Methods_DemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://demowebshop.tricentis.com/");
	      Thread.sleep(1000);
//	      WebElement ref = driver.findElement(By.xpath("//input[@type='submit']"));
//	      System.out.println(ref.getCssValue("color"));
//	      System.out.println(ref.getCssValue("font"));
//	      System.out.println(ref.getCssValue("position"));
//	      //locate any link and getArialRole and getAccessible Role
//	      WebElement element = driver.findElement(By.linkText("Log in"));
//	      System.out.println(element.getAriaRole());
//	      System.out.println(element.getAccessibleName());
//	      //to fetch the size of web element
//	       Dimension size = driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).getSize();
//	       System.out.println(size);
//	       System.out.println(size.getHeight());
//	       System.out.println(size.getWidth());
//	       //fetch the location of web element
//	      Point pos = driver.findElement(By.id("vote-poll-1")).getLocation();
//	      System.out.println(pos);
//	      System.out.println(pos.getX());
//	      System.out.println(pos.getY());
	      //fetch the size and location of web element using getRect();
	      Rectangle var = driver.findElement(By.xpath("//strong[.='Newsletter']")).getRect();
	      System.out.println(var.getX());
	      System.out.println(var.getHeight());
	      System.out.println(var.getY());
	      System.out.println(var.getDimension());
	      System.out.println(var.getPoint());
	      
	      
	      
	      
	       
	      
	}

}
