package method_parameters;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
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
	WebDriver driver;
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
	

}
