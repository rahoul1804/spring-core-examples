package exception2_19;

public class RethrowExceptio_ExceptionPropogation 
{
	static void m1()
	{
		System.out.println("m1 starts");
//		try
//		{
		m2();
//		}
//		catch (ArithmeticException e) 
//		{
//			System.out.println("exception is handeled in m1");
//		}
//		System.out.println("m1 ends");
		
		
	}
	static void m2()
	{
		System.out.println("m2 starts");
		if(true)
		{
			throw new ArithmeticException();
		}
		System.out.println("m2 ends");
	}
	

	public static void main(String[] args) 
	{
		m1();
		

	}

}
