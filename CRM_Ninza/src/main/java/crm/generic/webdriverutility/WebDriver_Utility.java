package crm.generic.webdriverutility;

import java.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

//This class has all the methods for WebDriver Actions
public class WebDriver_Utility {

	//This method will maximize the window
	public void maxTheWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	//This method will wait foe the page to load
	public void waitForPageTOLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	//This method will Explicitly wait for the element to be click able
	public void waitFofElementToBeClickable(WebDriver driver, WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	//This method will wait for the element to be visible
	
	public void waitForElementToBeVisisble(WebDriver driver,WebElement message )
	{
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(message));
	}
	//This method will wait for the element to be visible using fluent wait
	
	public void FluentwaitFoeElementToBeVisible(WebDriver driver, WebElement Message)
	{
		FluentWait<WebDriver> wait= new FluentWait<WebDriver>(driver);
		wait.pollingEvery(Duration.ofSeconds(3));
		wait.withTimeout(Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(Message));
		
	}
	
	//This method will switch the driver control to another window depending on partial window text
	public void switchTOWindow(WebDriver driver, String partial_text)
	{
		//Capture all the window Id's
		Set<String> windows = driver.getWindowHandles();
		
		//iterate through all the windows
		Iterator<String> it = windows.iterator();
		//check for the next window
		while(it.hasNext())
		{
			//capture the current window Id
			String winID=it.next();
			//capture the current window Title
			String currentWindowTitle=driver.switchTo().window(winID).getTitle();
			
			//Check whether the expected window appeared
			if(currentWindowTitle.contains(partial_text))
			{
				break;
			}
	    }
	
	}
	//This method handles the alert pop ups
	public ChromeOptions handleNotificationPopups() {
		
		ChromeOptions options=new ChromeOptions();
		
//		options.addArguments("--disable-features=PasswordLeakDetection");
		
		Map<String, Object> prefs=new HashMap<>();
		prefs.put("profile.password_manager_leak_detection",false);
        options.setExperimentalOption("prefs",prefs);
        return options;
	}
	//Handeling the pop up
	//
	//method to locate a web element using  mouse over actions
	public void mouseHover(WebDriver driver, WebElement element)
	{
		Actions action= new Actions(driver);
		action.moveToElement(element).perform();
	}

	public void waitForVisibilityOfElement(WebDriver driver, WebElement message) {
		// TODO Auto-generated method stub
		
	}
	
}
