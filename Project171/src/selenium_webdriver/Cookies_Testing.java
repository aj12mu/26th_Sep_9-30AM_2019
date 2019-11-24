package selenium_webdriver;

import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies_Testing 
{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //launch browser
		driver.get("http://outlook.com");       //Load page to browser
		driver.manage().window().maximize();  //Maximize browser window
	
		
		//How to Add Cookie to browser window.
		driver.manage().addCookie(new Cookie("GAPS", "1:4cx1v5M5qtKKR4G--4UsTEVHUfJa0g:t7eicLfJ_w2m9Hw3"));
		System.out.println("Cookie added successfull");
		
		
		//Using webdriver how to check secured browser or unsecured browser
		boolean flag=driver.manage().getCookieNamed("GAPS").isSecure();
		System.out.println("Browser Secure status is :--> "+flag);
		
		//Verify browser open with http or https protocal.
		boolean flag1=driver.manage().getCookieNamed("GAPS").isHttpOnly();
		System.out.println("Is cookie displayed with http ;--> "+flag1);
		

		//Get All cookies available under current browser.
		Set<Cookie> all_cookies=driver.manage().getCookies();
		//Iterator for all cookies
		for (Cookie cookie : all_cookies) 
		{
			System.out.println("DomainName is 			=> "+cookie.getDomain());
			System.out.println("Cookie Name is 			=> "+cookie.getName());
			System.out.println("Cookie value is 		=> "+cookie.getValue());
			System.out.println("Cookie expiry time is 	=> "+cookie.getExpiry());
			System.out.println("path of cookie is 		=> "+cookie.getPath());
			
			boolean flag2=driver.manage().getCookieNamed(cookie.getName()).isSecure();
			System.out.println("Is cookie is secure  		=> "+flag2);
			
			System.out.println("\n"+"\n");
			
		}
		
		
	
		
		

	}

}
