package datadriven.Excel;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_Excel_Data_Using_Conditions {

	public static void main(String[] args) throws Exception
	{
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
				
		//Get Workbook using file location
		XSSFWorkbook book=new XSSFWorkbook(fi);
		System.out.println("Workbook located");
				
		//Get Sheet using workbook reference
		XSSFSheet sht=book.getSheetAt(3);
		
		
		//iterate until last row data
		for (int i = 5; i <= sht.getLastRowNum(); i++) 
		{
			
			//Get execution status 
			String Exe_status=sht.getRow(i).getCell(2).getStringCellValue();
			
			
			//Writing decision to accept on Execution status is yes
			if(Exe_status.equals("y"))
			{
				String UID=sht.getRow(i).getCell(0).getStringCellValue();
				
				//get Scenario type
				String Stype=sht.getRow(i).getCell(3).getStringCellValue();
				
				//Decision to execute diff outputs inside loop
				if(Stype.equals("output_Dar_1"))
				{
					System.out.println("for " + UID+"   Output capture is "+Stype);
				}
				else if(Stype.equals("alert"))
				{
					System.out.println("for " + UID+"   Output capture is "+Stype);
				}
				else if(Stype.equals("text"))
				{
					System.out.println("for " + UID+"   Output capture is "+Stype);
				}
				else if(Stype.equals("p"))
				{
					System.out.println("for " + UID+"   Output capture is "+Stype);
				}
				else if(Stype.equals("n"))
				{
					System.out.println("for " + UID+"   Output capture is "+Stype);
				}
				
			}
			
		}

	}

}
