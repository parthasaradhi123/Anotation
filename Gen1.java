import java.util.*;

public class Gen1 
{
//	public void m1(ArrayList a) {}
//	public void m1(ArrayList b) {}
//	
	public static void main(String[] args)
	{
			
		ArrayList<String> al = new ArrayList<String>();//jdk(1.5)
		al.add("Parta");
		m1(al);
		System.out.println(al);
		
		
		ArrayList al2 = new ArrayList<Integer>();
		al2.add("String");
		al2.add("Partha");
		//Here the compier will check the LHS part is there any generics or not.
		
		ArrayList al3 = new ArrayList<String>();
		al3.add(10);
		al3.add(20);
		
		System.out.println(al2);
		System.out.println(al3);
		
		ArrayList<String> al4 = new ArrayList();
		// C.E al4.add(10);
		al4.add("reddy");
		
		

	}
	
	public static void m1(ArrayList al) // jdk(1.4)
	{
		al.add("saradhi");
		al.add(10);
		al.add(true);
	}

}
