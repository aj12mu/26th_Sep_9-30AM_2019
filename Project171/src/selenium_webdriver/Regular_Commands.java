package selenium_webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Regular_Commands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //launch browser
		driver.get("http://gmail.com");       //Load page to browser
		driver.manage().window().maximize();  //Maximize browser window
		
		
		//using this method we change current window dimension.[Width & height]
		driver.manage().window().setSize(new Dimension(300, 200));
	
		//Method return currently opened window dimensions.[width & hight]
		Dimension w_dim=driver.manage().window().getSize();
		System.out.println(w_dim);
		
		//Set coordination to load window[x & Y]
		driver.manage().window().setPosition(new Point(500, 200));
		
		//Get Window coordinations
		Point win_loc=driver.manage().window().getPosition();
		System.out.println(win_loc);
		
	}

}
