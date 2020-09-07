package operations;

public class Operations 
{
	static int x=20;
	int y=3;

	public static void main(String[] args) 
	{
	 
		int a=10;
		
		Operations op=new Operations();
		
		System.out.println("OPERATIONS      : RESULTS");
		System.out.println("_________________________");
		
		System.out.println("sum of 20+10    :"+(a+x));
		System.out.println("sub of 20-3     :"+(x-op.y));
		System.out.println("mul of 20*10    :"+(a*x));
		System.out.println("div of 20/3     :"+(x/op.y));
		System.out.println("module of 20%3  :"+(x%op.y));
		x++;
		System.out.println("20++ is         :"+(x));
		System.out.println("++21 is         :"+(++x));
		a--;
		System.out.println("10-- is         :"+(a));
		
		System.out.println("3==20           :"+(op.y==x));
		System.out.println("10!=20          :"+(a!=x));
		System.out.println("10!=20 && 3==10 :"+(a!=x &&op.y==a));
		System.out.println("10!=20 ||3==10  :"+(a!=x || op.y==a));
		
		
		System.out.println("3>20            :"+(op.y>x));
	}
	
	
}
