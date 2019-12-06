package datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Data_For_Webdriver_Testcase
{

	public static void main(String[] args) throws IOException
	{
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		//Get Workbook using file location
		XSSFWorkbook book=new XSSFWorkbook(fi);
		System.out.println("Workbook located");
		
		//Get Sheet using workbook reference
		XSSFSheet sht=book.getSheetAt(1);
		
		//Get row using sheet reference
		XSSFRow row=sht.getRow(1);
		
		
		//Browser initiation
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Get Application url from excel.
		String URL=row.getCell(1).getStringCellValue();
		driver.get(URL);
		
		//Get SignIn button location from excel
		String Sign_nav_btn=row.getCell(2).getStringCellValue();
		driver.findElement(By.xpath(Sign_nav_btn)).click();
		
		
		//Get Email Location and Email Input Data
		String Email_loc=row.getCell(3).getStringCellValue();
		String Email_input=row.getCell(4).getStringCellValue();
		driver.findElement(By.xpath(Email_loc)).clear();
		driver.findElement(By.xpath(Email_loc)).sendKeys(Email_input);
		
		//Get Next button from Excel
		String Email_Next_btn=row.getCell(5).getStringCellValue();
		driver.findElement(By.xpath(Email_Next_btn)).click();
		
		
	}

}
