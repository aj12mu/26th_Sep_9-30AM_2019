package corejava.Collections;

import java.util.Set;
import java.util.TreeSet;

public class Set_TreeSet {

	public static void main(String[] args) 
	{
		

		Set<String> set=new TreeSet<String>();
		set.add("IDE");
		set.add("RC");
		set.add("WD");
		set.add("GRID");
		set.add("Appium");
		
		for (String object : set) 
		{
			System.out.println(object);
		}
		

	}

}
