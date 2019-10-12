package browser_launch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome_Driver 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Inorder to launch chrome browser using webdriver, We need
		 * to download chromedriver.exe file and set runtime environment
		 * variable before launch chrome browser.
		 * 
		 * Download chromedriver.exe:-->
		 * 		URl:--> https://chromedriver.chromium.org/downloads
		 * 				FOR => chrome-browser-version = 77
		 * 				USE => ChromeDriver 77.0.3865.40
		 * 		=> Select Suitable version before click download link
		 * 		=> Select Operating system and download [chromedriver_win32.zip]
		 * 		=> unzip file to back up folder
		 * 		=> Setup runtime environement variable before launch browser.
		 * 
		 * 		Example:-->
		 * 			System.setProperty("webdriver.chrome.driver","chromdriver.exe");
		 * 
		 */
		
		
		//Set Runtime environment variable
		String path="D:\\sunill\\26th_Sep_9-30_AM\\Project171\\browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		//launch chrome browser
		ChromeDriver chrome=new ChromeDriver();
		//Load webpage chrome browser window
		chrome.get("https://facebook.com");
		
		
		chrome.close(); //Closing browser window.
		
		

	}

}
