package resource;

public class Drugs_behaviour 
{
	int price;
	String sideEffect;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getSideEffect() {
		return sideEffect;
	}
	public void setSideEffect(String sideEffect) {
		this.sideEffect = sideEffect;
	}
	@Override
	public String toString() {
		return "Drugs_behaviour [price=" + price + ", sideEffect=" + sideEffect + "]";
	}
	
	
	

}
