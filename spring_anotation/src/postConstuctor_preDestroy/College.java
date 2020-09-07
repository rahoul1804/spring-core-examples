package postConstuctor_preDestroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class College 
{
	int collId;
	String collName;
	public int getCollId() {
		return collId;
	}
	public void setCollId(int collId) {
		this.collId = collId;
	}
	public String getCollName() {
		return collName;
	}
	public void setCollName(String collName) {
		this.collName = collName;
	}
	@Override
	public String toString() {
		return "College [collId=" + collId + ", collName=" + collName + "]";
	}
	
	@PreDestroy
	public void init()
	{
		System.out.println("obj initialize");
		
	}
	
    @PostConstruct
	public void destroy()
	{
		System.out.println("obj destroyed");
		
	}
	
	

}
