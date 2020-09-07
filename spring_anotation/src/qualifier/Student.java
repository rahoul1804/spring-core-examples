package qualifier;


public class Student
{
private String stu_name;

public String getStu_name() {
	return stu_name;
}

public void setStu_name(String stu_name) {
	this.stu_name = stu_name;
}

@Override
public String toString() {
	return "Student [stu_name=" + stu_name + "]";
}

}