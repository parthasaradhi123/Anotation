//class Account<T>
//{
//	
//}
//
//Account<Gold> g = new Account<Gold>();
//Account<Bronze> g = new Account<Bronze>();
//Account<Silver> g = new Account<Silver>();
//

class Gen<T>
{
	T obj; // T is a type parameter which can accepts String,integer,Float
	
	
	Gen(T obj)
	{
		this.obj = obj;
	}
	
	public void show()
	{
		System.out.println("The type of Object is :: "+obj.getClass().getName());
	}
	
	public T getObj()
	{
		return obj;
		
		
	}
	
}






public class Generics {

	
	public static void main(String[] args) 
	{
	Gen<Integer> g =new Gen<Integer>(10);
	
	g.show();
	System.out.println(g.getObj());
	
	System.out.println("======================================================");
	Gen<String> g2 = new Gen<String>("Partha");
	g2.show();
	System.out.println(g2.getObj());
	System.out.println("========================================================");
	Gen<Float> g3 = new Gen<Float>(12.6f);
	g3.show();
	System.out.println(g3.getObj());
	
	
	
	
	}

}
