package keyword_driven_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator 
{
	
	public static By convert_locator(String pname, String pvalue)
	{
		
		By by=null;
		
		switch (pname) {
		
		case "id":
			by=By.id(pvalue);
			break;
			
		case "name":
			by=By.name(pvalue);
			break;
			
		case "classname":
			by=By.className(pvalue);
			break;
			
		case "linktext":
			by=By.linkText(pvalue);
			break;
			
		case "partiallinktext":
			by=By.partialLinkText(pvalue);
			break;
			
		case "cssselector":
			by=By.cssSelector(pvalue);
			break;
			
		case "xpath":
			by=By.xpath(pvalue);
			break;
			
		case "tagname":
			by=By.tagName(pvalue);
			break;

		default:
			break;
		}
		
		return by;
		
	}
	
	
	public static void main(String args[])
	{
		
		ExcelKeywords.filepath="C:\\Users\\Administrator\\git\\26th_Sep_9-30AM_2019\\Project171\\src\\keyword_driven_Framework\\";
		ExcelKeywords.getExcel_connection("KWD.xlsx", "Sheet1");
		
		String Locatorname=ExcelKeywords.GetCellData(3, 1);
		String Locatorvalue=ExcelKeywords.GetCellData(3, 2);
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		
		
		By Default_locator=convert_locator(Locatorname, Locatorvalue);
		driver.findElement(Default_locator);
		System.out.println("Element Identified");
		
	}
	
	

}
