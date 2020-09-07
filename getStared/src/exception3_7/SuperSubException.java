package exception3_7;

import java.io.IOException;

public class SuperSubException {

	class SuperClass
	{
	  void show() 
	  { 
		 System.out.println("super class"); 
	  }
	 
	  void show1()
	 {
	  	System.out.println("super class");
	 }
	  
	 void show2() throws ArithmeticException
		 {
		  	System.out.println("super class");
		 }
  }

	//-------------sub class-----------------//
	public class SubClass extends SuperClass
	{
	 void show() //throws IOException		//As the method show() doesn't throw any exception while in Super class, hence its overridden version also cannot throw any checked exception.	  
	  { 
		 System.out.println("sub class"); 
		 } 
    
	    void show1() throws ClassCastException   //unchecked exception can be hrown in subclass if it is not hrown in super class also.
	   {
         System.out.println("sub class");
	   }
	    
	    void show2() //     throws Exception   //can only throw same exception or no exception can never throw object of Exception class(super class)
		   {
	         System.out.println("sub class");
		   }
	 
	 
	 //---------------------------main-----------------------//
   public void main( String[] args )
	 {
	  SuperClass s=new SubClass();
	  s.show();
	  
	  s.show1();
	  
	  
	  
	 }  
	}

}
