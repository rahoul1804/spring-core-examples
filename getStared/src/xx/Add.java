package xx;

public class Add {

	int id;
	String location;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Add [id=" + id + ", location=" + location + "]";
	}
	
}
