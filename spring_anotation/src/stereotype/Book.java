package stereotype;

import org.springframework.stereotype.Component;

@Component
public class Book 
{
	int page;
	String name;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Book [page=" + page + ", name=" + name + "]";
	}
	
	

}
