import java.util.*;

public class Gen2 
{

	public static void main(String[] args) 
	{
		 TreeSet<String> t = new TreeSet();
		 t.add("A");
		 t.add("Z");
		 t.add("B");
		 t.add("Y");
		 t.add("T");
		 
		 System.out.println(t);
		 
		 TreeSet ts = new TreeSet();
		 
		 ts.add(new StringBuilder("A"));
		 ts.add(new StringBuilder("V"));
		 ts.add(new StringBuilder("Z"));
		 ts.add(new StringBuilder("R"));
		 ts.add(new StringBuilder("U"));
		 
		 System.out.println(ts);
		 

	}
 	 
	
}
