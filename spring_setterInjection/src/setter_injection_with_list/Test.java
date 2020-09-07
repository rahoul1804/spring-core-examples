package setter_injection_with_list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test 
{
	public static void main(String[] args) 
	{
	
		 
		ApplicationContext ap1=new ClassPathXmlApplicationContext("/setter_injection_with_list/stu.xml");
				
		Student s=(Student) ap1.getBean("st");
		s.display();

	}

}
