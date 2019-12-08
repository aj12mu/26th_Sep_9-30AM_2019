package datadriven.CSV_Files;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class Read_Data_From_CsvFiles {

	public static void main(String[] args) throws IOException 
	{
		
		String filepath="src\\datadriven\\CSV_Files\\TestData.csv";
		FileReader fr=new FileReader(filepath);
		System.out.println("Csv file located");
		
		//Create object for CsvReader
		CSVReader reader=new CSVReader(fr);
		
		//To Read Next Record [Rowin Excel/line in notepad]
		String record1[]=reader.readNext();
		System.out.println(record1[0]+"   "+record1[1]);
		
		
		//Read Next record [Next Rowin Excel [OR] Next line in notepad]
		String record2[]=reader.readNext();
		System.out.println(record2[0]+"   "+record2[1]);
		
		
		String records[];
		
		//Iterate until reader file has next records.
		while((records=reader.readNext())!=null)
		{
			System.out.println("=> "+records[0]+"   "+records[1]);
		}
		
		
		
	}

}
