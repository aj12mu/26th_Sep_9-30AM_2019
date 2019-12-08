package datadriven.PropertyFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_PropertyFile_Data {

	public static void main(String[] args) throws IOException 
	{
		
		//Target file location
		String filepath="C:\\Users\\Administrator\\git\\26th_Sep_9-30AM_2019\\Project171\\src\\datadriven\\PropertyFiles\\Input.properties";
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("file located");
		
		//Create object for Properties  
		Properties repository=new Properties();
		
		//Load all object to repository using file name
		repository.load(fi);
		
		
		//Get Any Object value using It's keynam from repository
		String url=repository.getProperty("facebook.url");
		System.out.println(url);
		
		
		//get property value using keyname
		String UID=repository.getProperty("username");
		System.out.println(UID);  
	}

}
