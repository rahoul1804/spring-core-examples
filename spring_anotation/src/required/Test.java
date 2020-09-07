package required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{

	public static void main(String[] args) 
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("/required/emp.xml");
		
		Employee e=(Employee) ap.getBean("emp");
		System.out.println(e);
		
	}
}
