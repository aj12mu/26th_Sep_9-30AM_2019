package screenshot;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Screen_With_time_Stamp 
{
	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver","Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  			  
		driver.get("https://www.firstnaukri.com/");       
		driver.manage().window().maximize(); 
		
		
		//Get sysem Default date
		Date d=new Date();
		//Create simple date formatter
		SimpleDateFormat df=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
		//Convert default date using simple date formatter
		String time=df.format(d);
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screens\\"+time+"image1.png"));
		
	}

}
