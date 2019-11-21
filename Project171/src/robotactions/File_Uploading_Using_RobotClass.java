package robotactions;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class File_Uploading_Using_RobotClass 
{

	public static void main(String[] args) throws Exception
	{

		//set runtime environment variable
		String driver_path="browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
							    
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/account/register/basicdetails");
		driver.manage().window().maximize();
		
		
		WebElement Role_Exp=driver.findElement(By.xpath("//button[@value='exp']"));
		Role_Exp.click();
		Thread.sleep(3000);
		
		
		//Identify UploadCV button
		WebElement Upload_CV_Btn=driver.findElement(By.name("uploadCV"));
		new Actions(driver).click(Upload_CV_Btn).perform();
		Thread.sleep(3000);
		
		
		String text="C:\\Users\\Administrator\\Downloads\\Sunil.docx";
		
		//Select text before copy to clipboard
		StringSelection Stext=new StringSelection(text);
		//Get Default system clipboard
		Clipboard sys_clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Add copied string content to system clipbaord
		sys_clipboard.setContents(Stext, Stext);
		
		
		//Create object for robot class
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		
		//use Control+V shortcut to paste copied text
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Release Downkeys Control
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		//Press Enter keyword to submit upload resume
		robot.keyPress(KeyEvent.VK_ENTER);
		
		

	}

}
