

@FunctionalInterface
interface IName
{
	public abstract int hey(int a,int b);
	
}

class A
{
	public A()
	{
		System.out.println(":: Hey guys I am a constructor ::");
	}
	public  int add(int x,int y)
	{
		return x+y;
	}
	public  int sub(int x,int y)
	{
		return x-y;
	}
	public  int mul(int x,int y)
	{
		return x*y;
	}
}



///Now my requiement is I wanna call the methods that are present in A that to using thefunctinal interface.


public class ConstructorR {

	public static void main(String[] args) 
	{
		 
		A a = new A();
		
		IName i = (m,n)->{
							int p = a.add(2, 3);
							return p;
						};
						
		System.out.println(i.hey(10,20));
		
		IName i2 = (m,n)->{
							int q = a.sub(20, 10);
							return q;
							};
							
		System.out.println(i2.hey(10,20));
							
		IName i3 = (m,n)->{
								int r = a.mul(20, 10);
								return r;
								};
		
		System.out.println(i3.hey(40,20));					
		
//===================================================================================================
		IName i4;
		
		i4 = a::add;
		int rl  = i4.hey(50, 20);
		System.out.println(rl);
///=====================================================================//
		i4 = a::sub;
		int r2 = i4.hey(30, 5);
		System.out.println(r2);
//=============================================================================================
		i4 = a::mul;
		int r3 = i4.hey(2, 3);
		System.out.println(r3);
//=======================================================================================
		
		
		
		
		
	}

}
