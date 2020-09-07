package setter_injection_with_list;

import java.util.Iterator;
import java.util.List;

public class Student 
{
	int id;
	String name;
	List<String> books;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getBooks() {
		return books;
	}
	public void setBooks(List<String> books) {
		this.books = books;
	}
	
	
	
	public void display() 
	{
		System.out.println("id "+id +"name :"+name);
		System.out.println("BOOks he has: ");
		
		  Iterator<String> itr=books.iterator();  
		    while(itr.hasNext())
		    {  
		        System.out.println(itr.next());  
		    }
		
	}
	
}
	
	


