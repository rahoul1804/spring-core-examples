package listIterator23;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorPreviousOne 
{
	public static void main(String[] args)
	{
	
		List a=new ArrayList();
			a.add(10);
			a.add(20);
			a.add(30);
			a.add("java");
			
			
			ListIterator listItr=a.listIterator();
			
			//-------foword print------//
			System.out.println("forword print");
		    while(listItr.hasNext())
		    {
		    	System.out.println(listItr.next());
		    }
		    
		    
		    
		    System.out.println("---------------");
		    //------backwod print-----//
		    System.out.println("backword print");
		    
		    
		    while(listItr.hasPrevious())
		    {
		    	System.out.println(listItr.previous());
		    }
		
	}

}
