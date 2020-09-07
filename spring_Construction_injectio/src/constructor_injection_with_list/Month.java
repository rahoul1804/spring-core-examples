package constructor_injection_with_list;

public class Month {
	private int days;
	private String name;
	public Month(int days, String name) {
		super();
		this.days = days;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Month [days=" + days + ", name=" + name + "]";
	}
	

}