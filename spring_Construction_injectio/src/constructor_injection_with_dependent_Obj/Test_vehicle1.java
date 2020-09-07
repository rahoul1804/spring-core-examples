package constructor_injection_with_dependent_Obj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_vehicle1 
{
   public static void main(String[] args) 
   {
	   ApplicationContext ap=new ClassPathXmlApplicationContext("/constructor_injection_with_dependent_Obj/v.xml");
	   
	   Vehicle1 v=(Vehicle1) ap.getBean("vv");
	   System.out.println(v);
	
}
	
}
