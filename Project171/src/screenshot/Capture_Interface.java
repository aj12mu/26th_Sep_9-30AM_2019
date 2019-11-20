package screenshot;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Interface 
{

	public static void main(String[] args) throws IOException 
	{
		
		/*
		 * 	Note:-->To use fileutils[local folders and files] in selenium 
		 * 			3.6 above version ,below downloads required.  
		 * 
		 * URL:--> https://commons.apache.org/proper/commons-io/download_io.cgi
		 * 		   Download binrary file  --> commons-io-2.6-bin.zip
		 * 		   Unzip file and configure all executable jar files to selenium-project.
		 */
		
		
		//Set Runtime environment variable for chrome driver
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
		
		//Capturesceen and converting into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Dump file into local utilites 
		FileUtils.copyFile(src, new File("screens\\image.png"));
		
		
		/*
		 * Disadvantages:-->
		 * 				While capturing screen shorts using webdriver.
		 * 
		 * 			=> Only Capture Top frame of window.
		 * 			=> Failed to capture when alert presented at webpage.
		 * 			=> When screen capture repeatedly it override image.
		 */
		

	}

}
