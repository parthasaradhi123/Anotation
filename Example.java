import java.util.function.*;


class MyPredicate implements Predicate
{

	@Override
	public boolean test(Object t) {
		// TODO Auto-generated method stub
		return false;
	}
}
public class Example 
{

	public static void main(String[] args) 
	{
		 int[] arr = {10,3,4,50,60,70,90,70,85};
		 Predicate<Integer> p = i -> i>10;
		 m1(p,arr);
		 
		 System.out.println();
		 System.out.println("=======================");
		 Predicate<Integer> p2 = i -> i%2==0;
		 m1(p2,arr);
		 
		 
		 System.out.println();
		 System.out.println(":: Elements which are greater than 10 and even ::");
		 m1(p.and(p2), arr);
		 
		 System.out.println();
		System.out.println("elements which are not even");
		m1(p2.negate(),arr);
		
		System.out.println();
		System.out.println(":: Elements which are greater than 10 or even ::");
		m1(p2.or(p),arr);
		
		
		 
		 
		 
		 
		 
	}
	public static void m1(Predicate<Integer> p,int[] x)
	{
		for(int ele:x)
		{
			if(p.test(ele))
			{
				System.out.print(ele+" ");
			}
		}
	}

}		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
//		 int[] ar = new int[20];
//		 int j=0;
//		 for(int i=0;i<arr.length;i++)
//		 {
//			 if(arr[i]>10)
//			 {
//				 ar[j]=arr[i];
//				 j++;
//				 
//			 }
//		 }


