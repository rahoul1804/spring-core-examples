package required;

import org.springframework.beans.factory.annotation.Required;

public class Employee 
{
	int id;
	String name;
	
	
	public int getId() {
		return id;
	}
	@Required
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
	
	

}
