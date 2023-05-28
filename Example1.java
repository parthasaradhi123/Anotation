import java.util.*;
import java.util.function.*;

class MyConsumer implements Consumer<String>
{
	@Override
	public void accept(String name)
	{
		System.out.println(name);
	}
}

public class Example1 
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
		
		//System.out.println(names);
		
		Consumer<String> c = new MyConsumer();
		 names.forEach(c);
		 
		System.out.println("=========================================");
		
		//Lambda expressions.
		names.forEach(name ->System.out.println(name));
		
		System.out.println("============================================");
		//printing data using method reference.
		names.forEach(System.out::println);
		
	}

}
