import java.util.*;
import java.util.stream.Collectors;
 


public class Example2 
{

	public static void main(String[] args)
	{
		 ArrayList<Integer> al = new ArrayList();
		 al.add(10);
		 al.add(3);
		 al.add(20);
		 al.add(45);
		 al.add(26);
		 al.add(4);
		 
		 for(Integer ele:al)
		 {
			 if(ele%2 ==0)
			 {
				 System.out.println(ele);
			 }
		 }
		 
		 
		 // You can perfome the above operation with the help of API's and u can actually write very less 
		 // code.
		 
		 // we are using an interface called stream when ever we are using that interface two things should be
		 // mandatory .
		 //1.Configure using stream().
		 //2.Procces the data using some methods 
		 
		 List<Integer> la = al.stream().filter(i->i%2==0).collect(Collectors.toList());

		// System.out.println(la);
		 la.forEach(System.out::println);
	}

}
