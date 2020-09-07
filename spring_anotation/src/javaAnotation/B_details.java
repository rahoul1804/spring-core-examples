package javaAnotation;

public class B_details {
	
	int modelNumber;
	int noOfGears;
    double price;
    
	public B_details(int modelNumber, int noOfGears, double price) {
		super();
		this.modelNumber = modelNumber;
		this.noOfGears = noOfGears;
		this.price = price;
	}

	@Override
	public String toString() {
		return "B_details [modelNumber=" + modelNumber + ", noOfGears=" + noOfGears + ", price=" + price + "]";
	}
	

}
