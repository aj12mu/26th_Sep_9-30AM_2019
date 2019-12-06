package datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_data_from_numeric_Cell 
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
		
		
		/*
		 * Note:-->
		 * 		=> in Excel to read numeric value from cell, we follow
		 * 			getNumericCellData
		 * 		=> GetNumericCellData return value in Double format.
		 * 		=> Double is a Decimal data type and it allows double
		 * 			value to convert into other numeric types
		 * 					[byte,short,int,long]
		 * 
		 */
		
		//Double primitive datatype
		double pwd_integer=row.getCell(2).getNumericCellValue();
		System.out.println(pwd_integer);
		
		Double pwd_int_Double=row.getCell(2).getNumericCellValue();
		System.out.println("Password in decimal format => "+pwd_int_Double);
		
		
		//Double format value converting into integer format
		int Pwd_int_frmt=pwd_int_Double.intValue();
		System.out.println("Password in Interger format => "+Pwd_int_frmt);
		
		
		//Read 10 digit mobile number form Excel
		Double Mobile_in_double=row.getCell(3).getNumericCellValue();
		System.out.println("Mobile Number in double format => "+Mobile_in_double);
		
		//Convert 10 digit mobile number form double format to long
		long Mobile_long_frmt=Mobile_in_double.longValue();
		System.out.println("Mobile number in long format => "+Mobile_long_frmt);
		System.out.println(Mobile_in_double.intValue());
		
		
		/*
		 * Converting mobile number from double format to String format.
		 */
		String Mobile_Str_frmt=NumberToTextConverter.toText(Mobile_in_double);
		System.out.println("Mobile number in string format => "+Mobile_Str_frmt);
		
		
		/*
		 * Note:--> We can also convert numeric cell type to String Celltype
		 * 			manually from Excel.
		 * 
		 * 			=> In Excel within in cell before number add singlecode
		 * 				keyboard value  <<  '9030248855 >>, Single code
		 * 				shortcut convert numeric cell type to String celltype.   
		 */
		
		
		/*
		 * Exceptions during Reading Excel Data:-->
		 * 
		 * 			=> If file not was located
		 * 						FileNotFoundException
		 * 			=> If sheet,row,cell any oneof not specified as required.
		 * 						NullPointerException
		 * 			=> When Data read from diff format.
		 * 						IllegalStateException
		 */
		
		
		
		
		
	}

}
