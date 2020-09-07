package setterInjection;

public class Vehicle
{
	private int vId;
	private String vName;
	
	
	public int getvId() {
		return vId;
	}
	public void setvId(int vId) {
		this.vId = vId;
	}
	public String getvName() {
		return vName;
	}
	public void setvName(String vName) {
		this.vName = vName;
	}
	
	
	public void displayV()
	{
		System.out.println("vehicle details:"+"id="+vId +","+"name="+vName);
	}

}
