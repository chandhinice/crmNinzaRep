package crm.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_WebElements {
	WebDriver driver;
	public HomePage_WebElements(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//span[text()='Create Campaign']")
	private WebElement CREATE_CAMPAIGN;
	
	public WebElement getCREATE_CAMPAIGN() {
		return CREATE_CAMPAIGN;
	}
	@FindBy(xpath = "//a[text()='Campaigns']")
	private WebElement CAMPAIGNS;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement CONTACTS;

	@FindBy(xpath="//a[text()='Leads']")
	private WebElement LEADS;
	
	@FindBy(xpath="//a[text()='Opportunities']")
	private WebElement  OPPORTUNITIES;
	
	@FindBy(xpath="//a[text()='Products']")
	private WebElement   PRODUCTS;
	
	@FindBy(xpath="//a[text()='Quotes']")
	private WebElement  QUOTES ;
	
	@FindBy(xpath="//a[text()='Purchase Order']")
	private WebElement PURCHASEORDER ;
	
	@FindBy(xpath="//a[text()='Sales Order']")
	private WebElement   SALES_ORDER;
	
	@FindBy(xpath="//a[text()='Invoice ']")
	private WebElement INVOICE  ;
	public WebElement getCAMPAIGNS() {
		return CAMPAIGNS;
	}

	public WebElement getLEADS() {
		return LEADS;
	}

	public WebElement getOPPORTUNITIES() {
		return OPPORTUNITIES;
	}

	public WebElement getPRODUCTS() {
		return PRODUCTS;
	}

	public WebElement getQUOTES() {
		return QUOTES;
	}

	public WebElement getPURCHASEORDER() {
		return PURCHASEORDER;
	}

	public WebElement getSALES_ORDER() {
		return SALES_ORDER;
	}

	public WebElement getINVOICE() {
		return INVOICE;
	}

	public WebElement getCONTACTS() {
		return CONTACTS;
	}
	
	
	

}
