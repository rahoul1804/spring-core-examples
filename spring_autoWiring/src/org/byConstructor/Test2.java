package org.byConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 
{
   public static void main(String[] args) 
   {
	   ApplicationContext ap=new ClassPathXmlApplicationContext("/org/byConstructor/v2.xml");
	   
	   Vehicle2 v=(Vehicle2) ap.getBean("vv");
	   System.out.println(v);
	
}
	
}
