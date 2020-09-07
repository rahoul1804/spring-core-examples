package postConstuctor_preDestroy;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestColl
{
	public static void main(String[] args) 
	{
		
		AbstractApplicationContext ap=new ClassPathXmlApplicationContext("/postConstuctor_preDestroy/college.xml");
		
		College c=(College) ap.getBean("c");
		System.out.println(c);
		
		ap.registerShutdownHook();
	}

}
