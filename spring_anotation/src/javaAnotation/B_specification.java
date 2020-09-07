package javaAnotation;

public class B_specification
{
	int brake;
	String color;
	
	public B_specification(int brake, String color) {
		super();
		this.brake = brake;
		this.color = color;
	}
	@Override
	public String toString() {
		return "B_specification [brake=" + brake + ", color=" + color + "]";
	}
	
  
}
