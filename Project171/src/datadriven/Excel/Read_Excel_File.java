package datadriven.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Read_Excel_File 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		
		/*
		 * Because Excel files are binary files, We should target
		 * file location using "FileinputStream.."
		 */
		
		File file=new File("TestData\\InputData.xlsx");
		FileInputStream fi=new FileInputStream(file);  //if file not located then it interupt the run
		System.out.println("inputData file located");
		
		
		

		
		try {
			
			FileInputStream sfi=new FileInputStream("TestData\\Sample.xlsx");
			System.out.println("Sample file located");
			//If file not located it catch the exception and continue run.
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
