package datadriven.Excel;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_UserLogin_With_multiple_Rows_Data 
{
	
	static FileInputStream fi;
	static String file_location="TestData\\InputData.xlsx";
	static XSSFWorkbook book;
	static WebDriver driver;
	static String url;
	static String driver_path="browser_drivers\\chromedriver.exe";

	public static void main(String[] args) throws IOException, Exception 
	{
		
		//Target location
		fi=new FileInputStream(file_location);
		book=new XSSFWorkbook(fi);
		
		System.setProperty("webdriver.chrome.driver", driver_path);
		driver=new ChromeDriver();
		
		
		
		//Target sheet
		XSSFSheet sht=book.getSheet("Sheet3");
		
		//Get Lastrow data count
		int Rcount=sht.getLastRowNum();
		

		//iterate for number of rows
		for (int i = 5; i <= Rcount; i++)
		{
			url=sht.getRow(0).getCell(1).getStringCellValue();
			driver.get(url); //Load webpage each iteration before.
			
			//Getting locations from Static row and static cell
			String UID_loc=sht.getRow(1).getCell(1).getStringCellValue();
			String PWD_loc=sht.getRow(2).getCell(1).getStringCellValue();
			String Login_btn_loc=sht.getRow(3).getCell(1).getStringCellValue();
			
			
			//Static Cell data from dynamic rows
			String UID=sht.getRow(i).getCell(0).getStringCellValue();
			String PWD=sht.getRow(i).getCell(1).getStringCellValue();
			
			
			driver.findElement(By.xpath(UID_loc)).clear();
			driver.findElement(By.xpath(UID_loc)).sendKeys(UID);
			
			driver.findElement(By.xpath(PWD_loc)).clear();
			driver.findElement(By.xpath(PWD_loc)).sendKeys(PWD);
			
			driver.findElement(By.xpath(Login_btn_loc)).click();
			
			Thread.sleep(2000);
		}
	}

}
