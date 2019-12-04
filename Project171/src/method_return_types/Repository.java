package method_return_types;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Repository 
{
	public WebDriver driver;
	WebDriverWait wait;
	
	
	/*
	 * Keywordname:-->   Launch_browser
	 * Author:-->Sunil
	 * createdOn:--> 03/12/2019
	 * ReviewedBy:--> Test-Lead
	 * Parameters Used:--> Local Parameters only
	 * LastUpdated Date:--> 
	 */
	public void launch_browser(String browser_name)
	{
		String browser=browser_name;
		switch (browser) 
		{
		
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "browser_drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			break;
			
		case "ie":
			System.setProperty("webdriver.ie.driver", "browser_drivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			break;

		default: System.out.println("Browser name mismatch");
			break;
		}
		

	}
	
	/*
	 * Keywordname:-->   Open Webapge
	 * Author:-->Sunil
	 * createdOn:--> 03/12/2019
	 * ReviewedBy:--> Test-Lead
	 * Parameters Used:--> Local Parameters only
	 * LastUpdated Date:--> 
	 */
	public void load_webpage(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	
	/*
	 * Keywordname:-->   WebDriver timeouts
	 * Author:-->Sunil
	 * createdOn:--> 03/12/2019
	 * ReviewedBy:--> Test-Lead
	 * Parameters Used:--> Local Parameters only
	 * LastUpdated Date:--> 
	 */
	public void set_timeout(int time_in_sec)
	{
		driver.manage().timeouts().implicitlyWait(time_in_sec, TimeUnit.SECONDS);
		wait=new WebDriverWait(driver, time_in_sec);
	}
	
	
	/*
	 * Keywordname:-->   Enter_text    [Identification using Xpath]
	 * Author:-->Sunil
	 * createdOn:--> 03/12/2019
	 * ReviewedBy:--> Test-Lead
	 * Parameters Used:--> Local Parameters only
	 * LastUpdated Date:--> 
	 */
	public void Enter_Text(String Element_Xpath,String InputData)
	{
		WebElement Editbox=driver.findElement(By.xpath(Element_Xpath));
		Editbox.clear();
		Editbox.sendKeys(InputData);
	}
	
	
	
	/*
	 * Keywordname:-->   Enter_text    [Identification using By locator class]
	 * Author:-->Sunil
	 * createdOn:--> 03/12/2019
	 * ReviewedBy:--> Test-Lead
	 * Parameters Used:--> Local Parameters only
	 * LastUpdated Date:--> 
	 */
	public void Enter_Text(By locator,String InputData)
	{
		WebElement Editbox=driver.findElement(locator);
		Editbox.clear();
		Editbox.sendKeys(InputData);
	}
	
	
	/*
	 * Keywordname:-->   Enter_text    [Identification using WebElement][For POM]
	 * Author:-->Sunil
	 * createdOn:--> 03/12/2019
	 * ReviewedBy:--> Test-Lead
	 * Parameters Used:--> Local Parameters only
	 * LastUpdated Date:--> 
	 */
	public void Enter_Text(WebElement Element,String InputData)
	{
		WebElement Editbox=wait.until(ExpectedConditions.visibilityOf(Element));
		Editbox.clear();
		Editbox.sendKeys(InputData);
	}
	
	
	
	/*
	 * Keywordname:-->   Select_Dropdown    [Identification using Xpath]
	 * Author:-->Sunil
	 * createdOn:--> 03/12/2019
	 * ReviewedBy:--> Test-Lead
	 * Parameters Used:--> Local Parameters only
	 * LastUpdated Date:--> 
	 */
	public void Select_Dropdown(String Element_Xpath,String OptionName)
	{
		WebElement Dropdown=driver.findElement(By.xpath(Element_Xpath));
		new Select(Dropdown).selectByVisibleText(OptionName);
	}
	
	
	/*
	 * Keywordname:-->   Select_Dropdown    [Identification using By Locators]
	 * Author:-->Sunil
	 * createdOn:--> 03/12/2019
	 * ReviewedBy:--> Test-Lead
	 * Parameters Used:--> Local Parameters only
	 * LastUpdated Date:--> 
	 */
	public void Select_Dropdown(By Locator,String OptionName)
	{
		WebElement Dropdown=driver.findElement(Locator);
		new Select(Dropdown).selectByVisibleText(OptionName);
	}
	
	
	
	/*
	 * Keywordname:-->   Select_Dropdown    [Identification using By Locators]
	 * Author:-->Sunil
	 * createdOn:--> 03/12/2019
	 * ReviewedBy:--> Test-Lead
	 * Parameters Used:--> Local Parameters only
	 * LastUpdated Date:--> 
	 */
	public void Select_Dropdown(WebElement Element,String OptionName)
	{
		WebElement Dropdown=wait.until(ExpectedConditions.visibilityOf(Element));
		new Select(Dropdown).selectByVisibleText(OptionName);
	}
	
	/*
	 * KeywordName:--> Click Any clickable element [link,button,radiobutton,checkbox]
	 * 					[Using Xpath]  
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */
	 public void click_element(String element_xpath)
	 {
		 WebElement Element=driver.findElement(By.xpath(element_xpath));
		 Element.click();
	 }
	 
	 
	 /*
	 * KeywordName:--> Click Any clickable element [link,button,radiobutton,checkbox]
	 * 					[Using By class refernce]  
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */
	 public void click_element(By locator)
	 {
		 WebElement Element=wait.until(ExpectedConditions.elementToBeClickable(locator));
		 Element.click();
	 }
	 
		 
	 /*
	 * KeywordName:--> Click Any clickable element [link,button,radiobutton,checkbox]
	 * 					[Using By class refernce]  
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */
	 public void click_element(WebElement element)
	 {
		 WebElement Element=wait.until(ExpectedConditions.elementToBeClickable(element));
		 Element.click();
	 }
	 
	 
	 
	 /*
	 * KeywordName:--> Mousehover on element.[Using Xpath parameter]
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */	 
	 public void mousehover(String Element_xpath)
	 {
		 WebElement Element=driver.findElement(By.xpath(Element_xpath));
		 new Actions(driver).moveToElement(Element).pause(3000).perform();
	 }
	 
	 
	 /*
	 * KeywordName:--> Mousehover on element.[Using By parameter]
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */	 
	 public void mousehover(By locator)
	 {
		 WebElement Element=driver.findElement(locator);
		 new Actions(driver).moveToElement(Element).pause(3000).perform();
	 }
		 
	 
	 /*
	 * KeywordName:--> Mousehover on element.[Using WebElement paramter]
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */	 
	 public void mousehover(WebElement element)
	 {
		 WebElement Element=wait.until(ExpectedConditions.visibilityOf(element));
		 new Actions(driver).moveToElement(Element).pause(2000).perform();
	 }
	 
	 /*
	 * KeywordName:--> Click on element using mouse actions [Using WebElement paramter]
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */	 
	 public void Click_using_mouse(String element_xpath)
	 {
		 WebElement Element=driver.findElement(By.xpath(element_xpath));
		 new Actions(driver).click(Element).pause(2000).perform();
	 }
	 
	 
	 /*
		 * KeywordName:--> Fileupload using robot class
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	 
		 public void FileUploading(String filepath)
		 {
		 	String text=filepath;
			
			//Select String
			StringSelection Stext=new StringSelection(text);
			//Get default system clipboard
			Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
			//set content to clipboard at runtime.
			clipboard.setContents(Stext, Stext);
			
			
			//Crate object for Robot class
			Robot robot=null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				e.printStackTrace();
			}
			robot.setAutoDelay(1000);
					
			//Press Ctrl+V to paste copied text into notepad file
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
					
			//Press enter key
			robot.keyPress(KeyEvent.VK_ENTER);
					
			//Release Control key
			robot.keyRelease(KeyEvent.VK_CONTROL);
	
		 }	 
		 
		 
		 /*
		 * KeywordName:--> CaptureScreen using [Filename]
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	 
		 public void capturescreen(String imagename)
		 {
			try {
				 Thread.sleep(5000);
				//creating simple date format
				SimpleDateFormat df=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
				//get system default date
				Date d=new Date();
				//Convert system date using default format
				String time=df.format(d);
				
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("screens\\"+time+imagename+".png"));
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		 }
		 
		 
		 /*
		 * KeywordName:--> SwitchTo window
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	 
		 public void switchto_window(String windowtitle) throws Exception
		 {
			
			//Get All dynamic window ID's
			Set<String> Allwindow_IDS=driver.getWindowHandles();
			
			//Iteate for all window times
			for (String EachWindowID : Allwindow_IDS) 
			{
				//Switch to Every window
				driver.switchTo().window(EachWindowID);
				//Capture every window title
				String Runtime_title=driver.getTitle();
				
				//Condition to accept on expected window title match
				if(Runtime_title.contains(windowtitle))
				{
					break;   //Stop Iteration and get execution control out of for loop.
				}
			}		
		 }
			 
			 
		 
		 /*
		 * KeywordName:--> Click element using javascript executor
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	 	 
		public void JS_clickElement(String Element_Xpath)
		{
			WebElement Element=driver.findElement(By.xpath(Element_Xpath));
			((JavascriptExecutor)driver).executeScript("arguments[0].click()", Element);
		}
		
		
	//Use Defined keywords with return type.
		
		
	 /*
	 * KeywordName:-->  Keyword verify title preseted at webpage and return boolean value.
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */
	public boolean is_titlePresented(String Exp_title)
	{
		String Runtime_title=driver.getTitle();
		boolean flag=Runtime_title.contains(Exp_title);
		return flag;
	}
	
	
	 /*
	 * KeywordName:-->  Keyword verify url preseted at webpage and return boolean value.
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */
	public boolean is_Url_presented(String Exp_url)
	{
		String Runtime_url=driver.getCurrentUrl();
		boolean flag=Runtime_url.contains(Exp_url);
		return flag;
	}
	

	 /*
	 * KeywordName:--> Method Verify Element presented at source and return boolean value true/false.
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */	 
	 public boolean is_Element_presented(String Exp_elementSource)
	 {
	 	String Runtime_pageSource=driver.getPageSource();
	 	boolean flag=Runtime_pageSource.contains(Exp_elementSource);
	 	return flag;
	 }
	 
	 
	 /*
	 * KeywordName:--> Verify text presented at element.
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */	 
	 public boolean is_text_presented_At_Element(By locator,String exp_text)
	 {
	 		String Element_text=driver.findElement(locator).getText();
	 		boolean flag=Element_text.contains(exp_text);
	 		return flag;
	 }
	 
	 
	 /*
	 * KeywordName:--> Verif text visible at webpage.
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */	 
	 public boolean istext_visible_at_webpage(String exp_text)
	 {
	 	String Page_Text=driver.findElement(By.tagName("body")).getText();
	 	boolean flag=Page_Text.contains(exp_text);
	 	return flag;
	 }
	 	
	 
	 /*
	 * KeywordName:--> Method Verify expected input available at editbox
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */	 
 	public boolean isInput_presented_At_Editbox(By locator,String input)
 	{
 		try {
 			boolean flag=wait.until(ExpectedConditions.textToBePresentInElementValue(locator, input));
 			return flag;
		} catch (Exception e) {
			return false;
		}
 		
 	}
 	
 	
 	/*
	 * KeywordName:--> Method verify alert presented at webpage
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */	
 	public boolean isAlert_Presented()
 	{
 		try {
			driver.switchTo().alert();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
 	}
 	
 	
 	/*
	 * KeywordName:--> Method  verify Expected text presented at alert
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */	
 	public boolean is_alert_text_presented(String exp_alert_text)
 	{
 		boolean flag=false;
 		if(isAlert_Presented())
 		{
 			String Runtime_alert_text=driver.switchTo().alert().getText();
 			flag=Runtime_alert_text.contains(exp_alert_text);
 			driver.switchTo().alert().accept();
 			return flag;
 		}
 		else
 		{
 			return flag;
 		}
 	}
 	
 	
 	/*
	 * MethodName:--> Method return selected row and cell value [From static table]
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	*/
	public WebElement Get_Static_Webtable_Cell(String TableXpath,int Row, int Cell)
	{
		//Identify Webtable
		WebElement table=driver.findElement(By.xpath(TableXpath));
		
		//Find number of rows available at webtable
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		//Target Required row
		WebElement SelectedRow=rows.get(Row);
		
		//using selected row find list of cells
		List<WebElement> cells=SelectedRow.findElements(By.tagName("td"));
		
		//Target Required Cell
		WebElement Webtable_cell=cells.get(Cell);
		
		return Webtable_cell;
	}
	
	
	/*
	 * MethodName:--> Method return selected Record referal cell [From Dynamic table]
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	*/
	
	public WebElement Get_Dynaic_Webtable_Cell(String TableXpath, String Recordname,int Cell)
	{
		//Identify Webtable
		WebElement table=driver.findElement(By.xpath(TableXpath));
		
		//Find number of rows available at webtable
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		boolean flag=false;
		WebElement Webtable_Cell = null;
		//Iterate for number of rows
		for (int i = 1; i < rows.size(); i++) 
		{
			
			//target Each Dynamic row at table
			WebElement DynamicRow=rows.get(i);
			
			//Capture text on Each Row
			String RowText=DynamicRow.getText();
			
			//Accept Condition where any record match in dynamic row
			if(RowText.contains(Recordname))
			{
				flag=true;
				System.out.println("Row Number is => "+i);
				
				//using Dynamic row find List of Cells
				List<WebElement> cells=DynamicRow.findElements(By.tagName("td"));
				
				//Target Required Cell
				Webtable_Cell=cells.get(Cell);
				break;  //stop Iteration
				
			}
		}//for
		
		 System.out.println("Record avaiable status is => "+flag);
		 return Webtable_Cell;
		
	}//Method
	
	
	
	
	
 	
 	
 	
 	
	 
}
