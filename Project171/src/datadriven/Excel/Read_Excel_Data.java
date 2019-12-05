package datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Read_Excel_Data 
{

	public static void main(String[] args) throws IOException   
	{
		
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		//Create object for Excel workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using workbook reference
		XSSFSheet sht=book.getSheet("Sheet1");
		
		//Target row using sheet reference
		XSSFRow row=sht.getRow(1);
		
		//target cell using row reference
		XSSFCell cell=row.getCell(0);
		
		//Read String value from Cell
		String Url=cell.getStringCellValue();
		System.out.println(Url);
		
		//Get Data from String cell
		String CID=sht.getRow(1).getCell(1).getStringCellValue();
		System.out.println(CID);
		
		
		//Get Data from Numeric Cell
		Double PWD_In_Doble=row.getCell(2).getNumericCellValue();
		System.out.println("Defult double format => "+PWD_In_Doble);
		
		//Converting double format value to String format
		String PWD_In_text=NumberToTextConverter.toText(PWD_In_Doble);
		System.out.println("PWD in string format => "+PWD_In_text);
		
		/*
		 * To Read Cell Data,We have four methods.
		 * 
		 * 			getStringCellValue :--> only read characters from cell
		 * 			getNumericCellValue;--> only read numbers from cell
		 * 			getBooleanCellvalue:--> only read boolean value true/false
		 * 			getDatecellValue   :--> only read data from data format cell
		 */
		
		
		

	}

}
