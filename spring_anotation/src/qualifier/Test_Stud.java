package qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Stud {


	public static void main(String[] args) 
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("/qualifier/NewFile.xml");
		School ss=(School) ap.getBean("skl");
	    
	     System.out.println(ss);
	}
}