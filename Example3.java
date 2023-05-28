import java.util.*;
import java.util.stream.Collectors;



public class Example3 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList();
		al.add(10);
		 al.add(3);
		 al.add(20);
		 al.add(45);
		 al.add(26);
		 al.add(4);
		 
		 System.out.println(al);
		 ArrayList<Integer> al2 = new ArrayList();
		 
		 
		 for(Integer ele:al)
		 {
			 al2.add(ele*2);
		 }
		 
		 System.out.println(al2);
		 
		 
		 //Streams
		 //Configure
		 
		List<Integer> lis =  al.stream().map(obj->obj*2).collect(Collectors.toList());
		
		System.out.println(lis);
		lis.forEach(i->System.out.print(i));
		System.out.println();
		lis.forEach(System.out::print);
		
		 
		 
		
	}

}
