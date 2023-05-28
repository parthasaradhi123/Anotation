import java.util.*;
import java.util.stream.Collectors;

public class Example4 
{

	public static void main(String[] args) 
	{
		 
		ArrayList<String> names = new ArrayList();
		names.add("Partha");
		names.add("saradhi");
		names.add("Reddy");
		names.add("venkata");
		names.add("subba");
		names.add("bhavana");
		
		System.out.println(names);
		System.out.println();
		
		ArrayList<String> uppernames = new ArrayList();
		
		for(String name:names)
		{
			uppernames.add(name.toUpperCase());
		}
		
		 System.out.println(uppernames);
		 System.out.println();
		 
		 //Streams
		 
		 System.out.println("=======================================================================");
		long co =  names.stream().filter(n->n.length()>5).count();
		System.out.println(co);
		
	List<String> lis2 =	names.stream().filter(n->n.length()>5).collect(Collectors.toList());
	System.out.println(lis2);
	System.out.println(lis2.size());
		
		System.out.println("=====================================================================");
		 
		 
		 
		 
		 
		 
		 
		 
		List<String> lisn =  names.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
		System.out.println(lisn);
		
		System.out.println();
		lisn.forEach(i->System.out.println(i));
		
		System.out.println();
		lisn.forEach(System.out::print);
		
	}

}
