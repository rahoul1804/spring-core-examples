package constructor_injection_with_list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("/constructor_injection_with_list/ym.xml");
		Year y=(Year)ap.getBean("year");
		System.out.println(y);
		
	}
	}