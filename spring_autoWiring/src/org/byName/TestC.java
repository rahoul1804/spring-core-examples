package org.byName;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestC {

	public static void main(String[] args) 
	{
	 
ApplicationContext ap=new ClassPathXmlApplicationContext("/org/byName/vv.xml");
		
		Vehicle1 vddd=(Vehicle1) ap.getBean("veh");
		vddd.displayV1();
		

	}

}