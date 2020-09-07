package org.byConstructor;


public class Vehicle2 {
	
	int number;
	 String name;
	 
	 Vehicle2_Details vd;
	 
	 
	public Vehicle2(int number, String name, Vehicle2_Details vd) {
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
