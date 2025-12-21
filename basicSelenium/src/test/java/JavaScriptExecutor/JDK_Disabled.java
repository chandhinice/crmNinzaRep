package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JDK_Disabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/java/technologies/javase-jdk21-doc-downloads.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='jdk-21.0.8_doc-all.zip']")).click();
		Thread.sleep(1000);
		WebElement ref = driver.findElement(By.xpath("//a[.='Download jdk-21.0.8_doc-all.zip']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()",ref);
		Thread.sleep(2000);
		//System.out.println(ref.isEnabled());
	}

}
