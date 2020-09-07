package javaAnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Testbike1 
{

	public static void main(String[] args)
	{
		
		ApplicationContext ap=new AnnotationConfigApplicationContext(Config_or_xml_without_beanInJava.class);
		
	   Bike1 b1=(Bike1) ap.getBean("bike_obj");
	   //Bike1 b1= ap.getBean(Bike1.class);
	   System.out.println(b1);
		
		
//		 AnnotationConfigApplicationContext app=new AnnotationConfigApplicationContext(Config_or_xml_without_beanInJava.class);
////		 app.register( Config_or_xml_without_beanInJava.class);
////		 app.register(B_specification.class);
//		 
//		 Bike1 bb=app.getBean(Bike1.class);
//		 
//		 System.out.println(bb);
		
		
		
	   
	}
}
