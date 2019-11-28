package corejava.Collections;

import java.util.Hashtable;
import java.util.Set;

public class Map_InterFace 
{

	public static void main(String[] args) 
	{
		/*
		 * Map:-->
		 * 		Store pair value to collection.
		 * 		In hashtable we store objects using [key & value]
		 * 				
		 */
		
	Hashtable<Integer, String> map=new Hashtable<Integer,String>();
	map.put(1, "IDE");
	map.put(2, "RC");
	map.put(3, "WD");
	map.put(4, "GRID");
	

	//Using keyname get Value from collections
	String toolname=map.get(3);
	System.out.println("toolname for 3rd key is => "+toolname);
	
	
	//Get all key values
	Set<Integer> set=map.keySet();
	for (Integer Eachkey : set) 
	{
			String produt=map.get(Eachkey);
			System.out.println(Eachkey+"   "+produt);
		
	}
	
		

	}

}
