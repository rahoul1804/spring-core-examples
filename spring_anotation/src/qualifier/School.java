package qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class School
{

private String skl_name;

@Autowired
@Qualifier("skll")
private Student skl_stu;



public String getSkl_name() {
	return skl_name;
}
public void setSkl_name(String skl_name) {
	this.skl_name = skl_name;
}
public Student getSkl_stu() {
	return skl_stu;
}
public void setSkl_stu(Student skl_stu) {
	this.skl_stu = skl_stu;
}
@Override
public String toString() {
	return "School [skl_name=" + skl_name + ", skl_stu=" + skl_stu + "]";
}

}