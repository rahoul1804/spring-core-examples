package appentAllElementToDiffCollection17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AppentAllElementToDiffCollection {

	public static void main(String[] args) 
	{
		 ArrayList<String> a=new ArrayList<>();
	      a.add("html");
	      a.add("java");
	      a.add("sql");
	      
	      List<String> l=new LinkedList<>();
	      
	      l.add("rahul");
	      l.add("manas");
	      
	      a.addAll(l);
	      
	      for(Object n:a)
	      {
	    	  System.out.println(n);
	      }
	    		 
	}

}
