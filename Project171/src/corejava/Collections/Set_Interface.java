package corejava.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Interface {

	public static void main(String[] args)
	{
	
		Set<String> set=new HashSet<String>();
		set.add("IDE");
		set.add("RC");
		set.add("WD");
		set.add("GRID");
		set.add("Appium");
		set.add("Cucumber");
		set.add("Robot");
		set.add("GRID");
		
		//Get Object Count at Collection
		int obj_count=set.size();
		System.out.println("list of object avaiable is => "+obj_count);
		
		//Remove object from Collection
		set.remove("Appium");
		
		//Verify Expected Object Available at collection
		boolean flag=set.contains("WD");
		System.out.println("Object Available status is => "+flag);
		
		//Read Next object from collection.
		String First_itr=set.iterator().next();
		System.out.println("First iterator value is => "+First_itr);
		
		//Clear Objects from collection
		//set.clear();
		
		//Verify Empty status of object
		boolean flag1=set.isEmpty();
		System.out.println("Empty Status is => "+flag1);
		
		
		//Using foreach read all Collection of objects
		for (String each_object : set) 
		{
			System.out.println(each_object);
		}
		
		
		//Using While loop iterate for Collection of object
		Iterator<String>  itr=set.iterator();
		while(itr.hasNext())
		{
			String obj=itr.next();
			System.out.println(obj);
		}

		
	}

}
