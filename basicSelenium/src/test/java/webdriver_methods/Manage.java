package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
//		driver.manage().window().minimize();
//		driver.manage().window().fullscreen();
//		Dimension size = driver.manage().window().getSize();	
//		System.out.println(size);
//		System.out.println(size.getHeight());
//		System.out.println(size.getWidth());
		//driver.manage().window().setSize(new Dimension(500, 500));
	   Point pos = driver.manage().window().getPosition();
	   System.out.println(pos);
	   System.out.println(pos.getX());
	   System.out.println(pos.getY());
	}

}
