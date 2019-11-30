package pageobjects.PageFactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;


public class RIF_Signup 
{
	
	@FindBy(how=How.XPATH,using="//a[contains(@href,'details')]")
	public WebElement Link_Create_new_Account;
	
	@FindBy(xpath="//input[contains(@name,'name')]")
	public WebElement Fullname_EB;
	
	@FindBy(css="input[name*='login']")
	public WebElement Email_ID_EB;
	
	@FindBy(css="input[value='Check availability']")
	public WebElement Email_Check_Availability_Btn;
	
	@FindBy(css = "input[name*='passwd']")
	public WebElement Password_EB;
	
	
	@FindBy(xpath = "//input[contains(@id,'Register')]")
	@CacheLookup  
	public WebElement Create_My_Account_Btn;
	
	
	@FindBys(@FindBy(css="select[name*='DOB']"))
	public List<WebElement> DOB_list;
	
}
