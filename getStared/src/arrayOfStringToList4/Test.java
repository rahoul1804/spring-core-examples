package arrayOfStringToList4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;  
import java.util.ArrayList; 

public class Test 
{
  
	   public static void main(String[] args)  
	   {  
	      String[] str = {"java","sql","html","css","j2ee"};  

	      //List<String> strList = Arrays.asList(str); 
	      
	      List<String> strList = new ArrayList<>(); 
	      Collections.addAll(strList, str); 

	      for (String n : strList)  
	      {  
	         System.out.println(n);  
	      }  
	   }  
	}

