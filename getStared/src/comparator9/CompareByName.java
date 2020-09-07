package comparator9;

import java.util.Comparator;

class Book {
	String name;
	int page;
	public Book(String s,int p) 
	{
		name=s;
		page=p;
	}
	public String toString()
	   {
		return "Book[title="+name+",pages="+page+"]";
		   
	   }

}

public class CompareByName implements Comparator
{

	@Override
	public int compare(Object x, Object y) 
	{
	
		String s1=((Book)x).name;
		String s2=((Book)y).name;
		return s1.compareTo(s2);
	}
	

}