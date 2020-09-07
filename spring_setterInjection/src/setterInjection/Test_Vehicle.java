package setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Vehicle 
{
	public static void main(String[] args)
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("/setterInjection/NewFile.xml");
		
		Vehicle v=(Vehicle) ap.getBean("veh");
		
		v.displayV();
		
	}

}
