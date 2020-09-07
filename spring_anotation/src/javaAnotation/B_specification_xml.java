package javaAnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class B_specification_xml 
{
	@Bean
	public B_specification b_spe_obj()
	{
		return new B_specification(2, "red");
	}
	
	

}
