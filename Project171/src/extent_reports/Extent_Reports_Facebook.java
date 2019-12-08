package extent_reports;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_Reports_Facebook 
{

	public static void main(String[] args) throws Exception 
	{
		String path="C:\\Users\\Administrator\\git\\26th_Sep_9-30AM_2019\\Project171\\src\\extent_reports\\";
		//Create object for extent reports
		ExtentReports reporter=new ExtentReports(path+"Report_WithScreen.html", true);
		
				//Create Report for Test
				ExtentTest test1=reporter.startTest("Tc001_Facebook_login_Invalid");
				
						//Set Runtime environment variable for chrome driver
						String chrome_path="browser_drivers\\chromedriver.exe";
						System.setProperty("webdriver.chrome.driver", chrome_path);
											    
						//browser initiation
						WebDriver driver=new ChromeDriver();
						test1.log(LogStatus.INFO, "Browser launched");
						
						driver.get("http://facebook.com");
						test1.log(LogStatus.INFO, "Browser launched");
						
						driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
						test1.log(LogStatus.INFO, "Implicit time assigned 50 seconds");
						
						driver.manage().window().maximize();
						test1.log(LogStatus.INFO, "Browser window maximized");
						
						
						driver.findElement(By.id("email")).clear();
						driver.findElement(By.id("email")).sendKeys("9030248855");
						
			
						//Screen location
						String screen_location="C:\\Users\\Administrator\\git\\26th_Sep_9-30AM_2019\\Project171\\screens\\screen1.png";
						
						File file_Src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						FileUtils.copyFile(file_Src, new File(screen_location));
			
						test1.log(LogStatus.PASS,
								"Email enter successfull",test1.addScreenCapture(screen_location));
						
						
						
						
				reporter.endTest(test1);
				
		
		reporter.flush();
	}

}
