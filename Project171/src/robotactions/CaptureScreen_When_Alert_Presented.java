package robotactions;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreen_When_Alert_Presented {

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("https://www.firstnaukri.com/");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
								
		
		//Identify Search button without enter details [It display alert]
		WebElement Search_btn=driver.findElement(By.xpath("//input[@type='submit']"));
		Search_btn.click();
		Thread.sleep(3000);
		
		
		//Create object for Robot class
		Robot robot=new Robot();
		
		//Get default system dimension
		Dimension Screen_dimension=Toolkit.getDefaultToolkit().getScreenSize();
		//Capture Screen using robot
		BufferedImage Image=robot.createScreenCapture(new Rectangle(Screen_dimension));
		//Dump Image into local utilites
		String filepath="C:\\Users\\Administrator\\git\\26th_Sep_9-30AM_2019\\Project171\\src\\robotactions\\alert.png";
		ImageIO.write(Image, "PNG", new File(filepath));
		
		/*
		 * Note:-->
		 * 		Selenium fail to capture screen when alert presented
		 * 		at webpage. But Robot framework capture screen even
		 * 		alert presented at webpage.
		 */
		

	}

}
