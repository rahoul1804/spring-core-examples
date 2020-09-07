package constructor_injection_with_list;

import java.util.Set;

public class Year {
	private int year;
	private Set<Month> m;
	public Year(int year, Set<Month> m) {
		super();
		this.year = year;
		this.m = m;
	}
	@Override
	public String toString() {
		return "Year [year=" + year + ", m=" + m + "]";
	}
	

}