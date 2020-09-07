package autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Bike 
{
	int bikeNumber;
	String BikeName;
	
	@Autowired
	Bike_specification b;
	
	
	public int getBikeNumber() {
		return bikeNumber;
	}


	public void setBikeNumber(int bikeNumber) {
		this.bikeNumber = bikeNumber;
	}


	public String getBikeName() {
		return BikeName;
	}


	public void setBikeName(String bikeName) {
		BikeName = bikeName;
	}


	public Bike_specification getB() {
		return b;
	}

	public void setB(Bike_specification b) {
		this.b = b;
	}


	@Override
	public String toString() {
		return "Bike [bikeNumber=" + bikeNumber + ", BikeName=" + BikeName + ", b=" + b + "]";
	}



	
	
	
}
