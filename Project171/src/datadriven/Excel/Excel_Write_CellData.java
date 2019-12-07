package datadriven.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write_CellData {

	public static void main(String[] args) throws IOException 
	{
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
				
		//Get Workbook using file location
		XSSFWorkbook book=new XSSFWorkbook(fi);
		System.out.println("Workbook located");
				
		//Get Sheet using workbook reference
		XSSFSheet sht=book.getSheetAt(0);
		
		
		//Update date from existing row and existing cell
		sht.getRow(1).getCell(1).setCellValue("New_CID_001");
		
		//Create Data in existing row and New cell
		sht.getRow(1).createCell(6).setCellValue("TestPass");
		
		//Create data at newRow and New cell
		sht.createRow(2).createCell(0).setCellValue(1200.0542);
		
		
		//Create data in new excel output file
		book.write(new FileOutputStream("TestData\\Op.xlsx"));
		book.close();
		
		
				

	}

}
