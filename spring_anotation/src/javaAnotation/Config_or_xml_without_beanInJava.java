package javaAnotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(B_specification_xml.class)
public class Config_or_xml_without_beanInJava 
{
	@Bean
	public B_details b_detail_ObjReturn()
	{
		return new B_details(123, 4, 15000);
		
	}

	@Bean
	public Bike1 bike_obj()
	{
		return new Bike1(5545, "hero",b_detail_ObjReturn() ,null);
		
	}
}
