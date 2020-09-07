package constructor_injection_with_dependent_Obj;


public class Vehicle1 {
	
	int number;
	 String name;
	 
	 Vehicle_Details1 vd;
	 
	 
	public Vehicle1(int number, String name, Vehicle_Details1 vd) {
		super();
		this.number = number;
		this.name = name;
		this.vd = vd;
	}
	 
	 
	public void displayV1()
	{
		System.out.println("vehicle details: "+" numberPlate="+number+" name="+name);
		System.out.println("-----");
	
		System.out.println( "Detail address:"+vd);
	}


	@Override
	public String toString() {
		return "Vehicle1 [number=" + number + ", name=" + name + ", vd=" + vd + "]";
	}
	

}
