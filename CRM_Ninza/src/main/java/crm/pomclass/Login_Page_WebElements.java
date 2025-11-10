package crm.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page_WebElements {
	
	WebDriver driver= null;
	//create a constructor
	public Login_Page_WebElements(WebDriver driver)
	{   
	 this.driver=driver;
	 PageFactory.initElements(driver,this);
     }
	@FindBy(name="username")
	private WebElement Username;
	
    @FindBy(id="inputPassword")
    private WebElement Password;
    
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement SignIn;
    
    public WebElement getUsername() {
		return Username;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getSignIn() {
		return SignIn;
	}
    
	 public void loginToapp(String user_name, String pass_word) 
	 {
		 Username.sendKeys(user_name);
		 Password.sendKeys(pass_word);
		 SignIn.click();
	 }
	 
}
