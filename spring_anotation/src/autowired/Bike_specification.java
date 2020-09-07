package autowired;


public class Bike_specification 
{
	int modelNumber;
	int noOfGears;
    double price;
    
	public int getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}
	public int getNoOfGears() {
		return noOfGears;
	}
	public void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Bike_specification [modelNumber=" + modelNumber + ", noOfGears=" + noOfGears + ", price=" + price + "]";
	}
    
    
	

}
