package construction_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) 
	{
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("/construction_injection/NewFile.xml");
		
		Vehicle v1=(Vehicle) ap.getBean("v");
		v1.display11();
		//System.out.println(v1);
	}

}
