package xx;

public class Emp {
	
	int id;
	String name;
	
	Add add;
	Educations ed;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Add getAdd() {
		return add;
	}
	public void setAdd(Add add) {
		this.add = add;
	}
	public Educations getEd() {
		return ed;
	}
	public void setEd(Educations ed) {
		this.ed = ed;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", add=" + add + ", ed=" + ed + "]";
	}
	
}
