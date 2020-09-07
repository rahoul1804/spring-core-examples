package setter_Injection_with_Dependent_Object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test_Vehicle1 {

	public static void main(String[] args) 
	{
	 
ApplicationContext ap=new ClassPathXmlApplicationContext("/setter_Injection_with_Dependent_Object/v.xml");
		
		Vehicle1 vddd=(Vehicle1) ap.getBean("veh");
		vddd.displayV1();
		

	}

}
