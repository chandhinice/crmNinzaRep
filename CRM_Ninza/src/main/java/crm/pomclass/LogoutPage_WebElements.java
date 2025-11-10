package crm.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage_WebElements {
	WebDriver driver=null;
	public LogoutPage_WebElements( WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//div[@class='user-icon']")
	private WebElement Profile;
	
	@FindBy(xpath="//div[.='Logout ']")
	private WebElement Logout;
	
	public WebElement getProfile() {
		return Profile;
	}

	public WebElement getLogout() {
		return Logout;
	}
}
