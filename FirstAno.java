import java.lang.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.text.Annotation;

 

///Annotations


//@CricketPlayer
//class Virat
//{
//	
//}


//Functional interface and one lambda expression is written based on this so dont add one more method.

@FunctionalInterface
interface Trial
{
	int getNum();
	 
}

class JavaLearning
{
	public void disp1()
	{
		System.out.println(":: Parent Disp :: ");
	}
}

class Focus extends JavaLearning
{
	@Override
	public void disp1()
	{
		System.out.println(":: Focus is the Key ::");
	}
}

//We can create our own Annotation using interface keyword and @

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer
{
	String name()default "india";
	int runs()default 20000;
	
}



@CricketPlayer
class ViratKohli
{
	private int innings;
	private String name;
	
	public int getInnings() {
		return innings;
	}
	public void setInnings(int innings) {
		this.innings = innings;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}




public class FirstAno {

	public static void main(String[] args)
	{
		Trial t = ()->{
						return 10;
						};
						
						
		ViratKohli vk = new ViratKohli();
		vk.setInnings(300);
		vk.setName("King");
		
		System.out.println(vk.getInnings());
		System.out.println(vk.getName());
		
		Class c = vk.getClass();
		java.lang.annotation.Annotation a= c.getAnnotation(CricketPlayer.class);
		
		CricketPlayer cp = (CricketPlayer)a;
		
		System.out.println(cp.runs());
		System.out.println(cp.name());
	}

}
