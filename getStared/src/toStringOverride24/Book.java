package toStringOverride24;

public class Book 
{
	int pages;
	String name;
	
	 Book(int p,String n)
	 {
		 pages=p;
		 name=n;
	 }
	 @Override
	 public String toString()
	 {
		return "Book[pages="+pages + " name:"+name+ "]";
		 
	 }
	 
	 public static void main(String[] args)
	 {
		 Book b=new Book(100, "java");
		 System.out.println(b);
		 
		
	}

}
