package org.byConstructor;


public class Vehicle2_Details 
{
	private String StatebelongsTo;
	 private String OwnerName;
	 
	 
	
	public Vehicle2_Details(String statebelongsTo, String ownerName) {
		super();
		StatebelongsTo = statebelongsTo;
		OwnerName = ownerName;
	}



	@Override
	public String toString() {
		return "Vehicle_Details1 [StatebelongsTo=" + StatebelongsTo + ", OwnerName=" + OwnerName + "]";
	}
	 
  
}
