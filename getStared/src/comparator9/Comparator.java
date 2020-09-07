package comparator9;

import java.util.Arrays;

public class Comparator 

{
   public static void main(String[] args)
   {
	   Book[] bArr={
			   new Book("java", 220),
			   new Book("jee", 320),
			   new Book("sql", 420),
			   
	   };
	   
	   System.out.println("sort by name");
	   Arrays.sort(bArr,new CompareByName());
	   
	   for(Book b:bArr)
	   {
		   System.out.println(b);
	   }
	   
	   System.out.println("sort by page");
	   
    Arrays.sort(bArr,new CompareByPage());
	   
	   for(Book b:bArr)
	   {
		   System.out.println(b);
	   }
	
}
   
}
