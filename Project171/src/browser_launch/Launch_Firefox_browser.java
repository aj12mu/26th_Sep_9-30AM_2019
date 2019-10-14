package browser_launch;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox_browser 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Inorder to launch firefox browser using webdriver, We need
		 * to download geckodriver.exe file and set runtime environment
		 * variable before launch firefox browser.
		 * 
		 * Download geckodrive.exe file:-->
		 * 		URL:--> https://github.com/mozilla/geckodriver/releases
		 * 		=>Download w.r.t fiefox browser version
		 * 					Fireox browser => 60>=
		 * 					geckodriver version = v0.26.0
		 * 	    => It ia zip format file, unzip file to backup folder
		 * 		=> And setup runtime environment variable before launch firefox browser
		 */
		
		//Set Runtime environment variable
		String path="D:\\sunill\\26th_Sep_9-30_AM\\Project171\\browser_drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		//Launch firefox browser
		FirefoxDriver firefox=new FirefoxDriver();
		//load webpage to browser window
		firefox.get("http://facebook.com");

	}

}
