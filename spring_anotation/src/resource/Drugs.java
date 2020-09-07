package resource;

import javax.annotation.Resource;



public class Drugs {
	int batchno;
	String name;
	
	@Resource
	Drugs_behaviour d;

	public int getBatchno() {
		return batchno;
	}

	public void setBatchno(int batchno) {
		this.batchno = batchno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Drugs_behaviour getD() {
		return d;
	}

	public void setD(Drugs_behaviour d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "Drugs [batchno=" + batchno + ", name=" + name + ", details=" + d + "]";
	}
	
	

}
