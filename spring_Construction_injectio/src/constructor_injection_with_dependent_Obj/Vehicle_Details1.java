package constructor_injection_with_dependent_Obj;

public class Vehicle_Details1 
{
	private String StatebelongsTo;
	 private String OwnerName;
	 
	 
	
	public Vehicle_Details1(String statebelongsTo, String ownerName) {
		super();
		StatebelongsTo = statebelongsTo;
		OwnerName = ownerName;
	}



	@Override
	public String toString() {
		return "Vehicle_Details1 [StatebelongsTo=" + StatebelongsTo + ", OwnerName=" + OwnerName + "]";
	}
	 
  
}
