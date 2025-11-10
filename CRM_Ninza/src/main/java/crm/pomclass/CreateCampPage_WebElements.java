package crm.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampPage_WebElements {

	WebDriver driver;
	public CreateCampPage_WebElements(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="campaignName")
	private WebElement Campname;
	
	@FindBy(name="campaignStatus")
	private WebElement Status;
	
	@FindBy(name="expectedCloseDate")
	private WebElement EXPDATE;
	
	@FindBy(xpath = "//button[.='Create Campaign']")
	private WebElement CREATE;
	
	@FindBy(name="targetSize")
	private WebElement Size;
	
	@FindBy(xpath="//div[contains(text(),'Campaign ')]")
	private WebElement Message;
	
	public WebElement getMessage() {
		return Message;
	}

	public WebElement getSize() {
		return Size;
	}

	public WebElement getCAMPNAME() {
		return Campname;
	}

	public WebElement getSTATUS() {
		return Status;
	}

	public WebElement getEXPDATE() {
		return EXPDATE;
	}

	public WebElement getCREATE() {
		return CREATE;
	}

	//create camp
	public void createCampWithExpDateFeilds( String  CAMPNAME, String TARGETSIZE,String DATE )
	{
		Campname.sendKeys(CAMPNAME);
		Size.sendKeys(TARGETSIZE);
		EXPDATE.sendKeys(DATE);
		CREATE.click();
	
	}
	public void createCampWithmandatoryFeilds( String  CAMPNAME, String TARGETSIZE )
	{
		Campname.sendKeys(CAMPNAME);
		Size.sendKeys(TARGETSIZE);
		CREATE.click();
	
	}
	
}