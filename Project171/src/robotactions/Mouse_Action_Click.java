package robotactions;


import java.awt.Robot;
import java.awt.event.InputEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mouse_Action_Click {

	public static void main(String[] args) throws Exception 
	{
		//Handling browser notification popup window.
		
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("https://www.cleartrip.com/");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		Thread.sleep(5000);								
				
		
		//Create object for robot
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		
		//Move cursor to location
		robot.mouseMove(308, 167);
		
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		//Mouse wheel [Scroll down]
		robot.mouseWheel(500);
		
		//Mouse wheel [Scroll up]
		robot.mouseWheel(-200);
	}

}
