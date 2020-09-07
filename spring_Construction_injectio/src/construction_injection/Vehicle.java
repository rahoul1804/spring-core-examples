package construction_injection;

public class Vehicle 
{
	int id;
	String name;
	
	public Vehicle(int id, String name)
	{
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + "]";
	}
	public void display11()
	{
		System.out.println( id+","+name);
	}
	
	

}
