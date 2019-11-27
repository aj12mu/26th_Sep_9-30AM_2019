package corejava.Loops;

import java.util.HashSet;
import java.util.Set;

public class Foreach_Loop {

	public static void main(String[] args) {
		
		//Array values to iterate using for-each
		String tools[]= {"IDE","RC","WD","GRID"};
		for (String Eachtool : tools) 
		{
			System.out.println(Eachtool);
		}
		
		
		//Integer dynamic value
		int num[]={100,200,300,400};
		for (int i : num) 
		{
			System.out.println(i);
		}
		
		
		//Store collection of objects
		Set<String> col=new HashSet<String>();
		col.add("IDE");
		col.add("RC");
		col.add("GRID");
		
		
		for (String toolname : col) 
		{
			System.out.println(toolname);
		}
		
		
		
		

	}

}
