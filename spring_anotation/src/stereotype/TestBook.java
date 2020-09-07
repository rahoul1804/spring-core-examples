package stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestBook {
	public static void main(String[] args)
	{
//		
//		ApplicationContext ap=new AnnotationConfigApplicationContext(Book_xml_or_confog.class);
//		
//	   //Book b1=(Book) ap.getBean("bookObj()");
//	   Book b1= ap.getBean(Book.class);
//	   System.out.println(b1);
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("stereotype/ster.xml");
		
		Book b2=(Book) ap.getBean("book");
		System.out.println(b2);
		
		

}
}