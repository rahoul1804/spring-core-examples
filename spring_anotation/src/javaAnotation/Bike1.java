package javaAnotation;

public class Bike1 {
	
	int bikeNumber;
	String BikeName;
	
	private B_details bd;
	
	private B_specification bs;
	
	
	public Bike1(int bikeNumber, String bikeName, B_details bd, B_specification bs) {
		super();
		this.bikeNumber = bikeNumber;
		BikeName = bikeName;
		this.bd = bd;
		this.bs = bs;
	}


	@Override
	public String toString() {
		return "Bike1 [bikeNumber=" + bikeNumber + ", BikeName=" + BikeName + ", bd=" + bd + ", bs=" + bs + "]";
	}

	
	
	
	
	

}
