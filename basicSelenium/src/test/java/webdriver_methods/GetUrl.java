package webdriver_methods;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrl {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
//		driver.findElement(By.linkText("Facebook")).click();
//		Thread.sleep(2000);
		
		@Nullable
		String title = driver.getTitle();
		System.out.println(title);
		@Nullable
		String url = driver.getCurrentUrl();
		System.out.println(url);
		@Nullable
		String page_src = driver.getPageSource();
		System.out.println(page_src);
//		driver.close();  
        Thread.sleep(4000);

//		driver.quit();
	
		
		

	}

	
	
}
