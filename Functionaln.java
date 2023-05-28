import java.util.function.*;

public class Functionaln
{

	public static void main(String[] args) 
	{
		Predicate<String> p = i -> i.length()>=3;
		//p = i -> i>10;
		System.out.println(p.test("Parta"));
		System.out.println(p.test("reddy"));
		System.out.println(p.test("pa"));
	}

}
