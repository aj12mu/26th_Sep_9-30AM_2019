package datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Multiple_Rows 
{

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		//Create object for Excel workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using workbook reference
		XSSFSheet sht=book.getSheet("Sheet3");
		
		
		/*
		 * getLastrownumber:-->
		 * 		Method return integer count for number of rows
		 * 		data available with in sheet.
		 */
		int Row_Data_Count=sht.getLastRowNum();
		System.out.println("Maximum row data count is => "+Row_Data_Count);
		
		/*
		 * getLastrownumber:-->
		 * 		Method return integer count from which row data
		 * 		started with in sheet,
		 */
		int First_row_num=sht.getFirstRowNum();
		System.out.println("Date started at => "+First_row_num);
		
		//Iterate For until row with in excel.
		for (int i = 5; i <= Row_Data_Count; i++) 
		{
			//Get Cell data from dynamic row and Static cell
			String UID=sht.getRow(i).getCell(0).getStringCellValue();
			System.out.println(UID);
			
		}

	}

}
