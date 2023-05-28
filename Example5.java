import java.util.*;
import java.util.stream.Collectors;


public class Example5 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList();
		al.add(10);
		al.add(0);
		al.add(15);
		al.add(5);
		al.add(20);
		al.add(14);
		
		
		
		Object[] obj = al.stream().toArray();
		
		for(Object ele:obj)
		{
			System.out.println(ele);
		}
		
		System.out.println("-------------------------------------------");
		Integer[] obj2 = al.stream().toArray(Integer[]::new);
		for(Integer ele:obj2)
		{
			System.out.println(ele);
		}
		System.out.println("======================================================");
		//Collections.sort(al);
		System.out.println(":: Before Sorting :: "+al);
	System.out.println("=======================================================");
		
	Integer min=al.stream().min((x,y)->x.compareTo(y)).get();
	Integer max = al.stream().max((x,y)->x.compareTo(y)).get();
	System.out.println(min);
	System.out.println(max);
	
	System.out.println("========================================================");
		
		
		
		
		//Sort using stream API.
		
		List<Integer> sor =al.stream().sorted().collect(Collectors.toList());
		System.out.println(":: After Sorting :: "+sor);
		
		//Custom Sorting
		
		     List<Integer> sortedDesc =  al.stream().sorted((i,i1)->i1.compareTo(i)).collect(Collectors.toList());
		     System.out.println("here data is sorted in descending order :: "+ sortedDesc);
	}

}
