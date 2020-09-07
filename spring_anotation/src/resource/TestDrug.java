package resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDrug 
{
	public static void main(String[] args) 
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("resource/drug.xml");
		
		Drugs d1=(Drugs) ap.getBean("d2");
		System.out.println(d1);
		
	}

}
