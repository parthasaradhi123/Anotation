import java.util.function.*;


class MyFunction implements Function<String,Integer>
{
	@Override
	public Integer apply(String s)
	{
		return s.length();
		
	}
}
public class Vimp {

	public static void main(String[] args) 
	{
		MyFunction mf = new MyFunction();
		
		int x = mf.apply("HarryBrook");
		int y = mf.apply("Markram");
		System.out.println(mf.apply("RInkuSIng"));
		System.out.println(x);
		System.out.println(y);
		
		
		Function<String,Integer> f = i->i.length();
		System.out.println(f.apply("Reddy"));

	}

}
