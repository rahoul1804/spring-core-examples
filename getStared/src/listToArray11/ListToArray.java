package listToArray11;

import java.util.ArrayList;

public class ListToArray

{
	public static void main(String[] args)
	{
      ArrayList<String> a=new ArrayList<String>();
      a.add("10");
      a.add("java");
      a.add("sql");
      
      Object[] o=a.toArray();
      
      
      //-------iterating from array------//
      
      for(Object n:o)
      {
    	  System.out.println(n+" ");
      }
      
	}

}
