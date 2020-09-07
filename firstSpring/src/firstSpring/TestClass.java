package firstSpring;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) 
	{
  
		AbstractApplicationContext app=new ClassPathXmlApplicationContext("NewFile.xml");
		
		
		HelloWorld h=(HelloWorld) app.getBean("hello");
		
       h.display();
       h.setName("rahul");
       h.display();
       
       
       String s=h.getName();
       System.out.println(s);
       
      app.registerShutdownHook();
       
	}

}
