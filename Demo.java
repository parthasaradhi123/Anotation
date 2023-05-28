
class Shiva<T extends Number> // It will only accepts Number class and its child classlike
// BYTE,Short,Long,Float,Integer.
{
	
}

class Sample<X extends Runnable>
{
	
}



public class Demo {

	public static void main(String[] args)
	{
		//Shiva<String> s = new Shiva<String>();
		Shiva<Number> s = new Shiva<Number>();
		Shiva<Integer> s2 = new Shiva<Integer>();
		
		
		Sample<Runnable> s3 = new Sample<Runnable>();
		Sample<Thread> s4 = new Sample<Thread>();
		
	}

}
