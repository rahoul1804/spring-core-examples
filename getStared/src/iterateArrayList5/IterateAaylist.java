package iterateArrayList5;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateAaylist {

	public static void main(String[] args)
	{
      ArrayList a=new ArrayList();
      a.add(10);
      a.add("java");
      a.add("sql");
      
      
      Iterator itr=a.iterator();
    		  {
    	       while(itr.hasNext())
    	       {
    	    	   System.out.println(itr.next());
    	       }
    		  }
		
	}

}
