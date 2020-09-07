package firstSpring;

public class HelloWorld
{
	int n;
	String name;
	
	          
         
	
	public int getN() {
		return n;
	}


	public void setN(int n) {
		this.n = n;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void init()
	{
		System.out.println("object initialized");
	}

	public void display()
	{
		System.out.println("hello :"+name);
	}
	public void destroy()
	{
		System.out.println("object destroyed");
	}
	
	
	
	

}
