package variables;

public class Variables 
{
	int a;
	static int b;
	
	public static void main(String[] args) 
	{
	   
		int a;
		a=10;
		
		System.out.println("local vaiable :"+a);
		
	    Variables v=new Variables();
	    v.a=20;
	    System.out.println("non static variable : "+v.a);
	    
	    Variables.b=30;     //OR in same class b=30; also possible
	    System.out.println("static vaiable :"+b);	
	}

}
