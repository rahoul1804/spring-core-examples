package setter_Injection_with_Dependent_Object;

public class Vehicle_Details 
{
	private String StatebelongsTo;
	 private String OwnerName;
	 
	public String getStatebelongsTo() {
		return StatebelongsTo;
	}
	public void setStatebelongsTo(String statebelongsTo) {
		StatebelongsTo = statebelongsTo;
	}
	public String getOwnerName() {
		return OwnerName;
	}
	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}
	
	
	//-------tostring------//
	public String toString(){  
	    return "ownername="+ OwnerName +"  StateBelongsTo=" +StatebelongsTo;  
	    
	}  
	  
	  

}
