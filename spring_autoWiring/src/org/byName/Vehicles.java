package org.byName;


class Vehicle1 
{
	 int number;
	 String name;
	
	 Vehicle_Det vd;
	
	
	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vehicle_Det getVd() {
		return vd;
	}

	public void setVd(Vehicle_Det vd) {
		this.vd = vd;
	}



	public void displayV1()
	{
		System.out.println("vehicle details: "+" numberPlate="+number+" name="+name);
		System.out.println("-----");
	
		System.out.println( "Detail address:"+vd);
	}
	

}
