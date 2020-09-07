package autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestB
{

	public static void main(String[] args) 
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("/autowired/Bike.xml");
		
		Bike b1= (Bike) ap.getBean("b");
		
		System.out.println(b1);
		
		
	}

}
