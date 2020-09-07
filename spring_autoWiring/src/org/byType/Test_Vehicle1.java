package org.byType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test_Vehicle1 {

	public static void main(String[] args) 
	{
	 
ApplicationContext ap=new ClassPathXmlApplicationContext("/org/byType/v.xml");
		
		Vehicle1 vddd=(Vehicle1) ap.getBean("veh");
		vddd.displayV1();
		

	}

}
