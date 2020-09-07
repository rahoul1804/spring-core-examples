package equalshashcode10;

import java.util.HashSet;
import java.util.Set;

public class EqualsAndHashcode 
{
 

public static void main(String[] args) 
	{

		Set s= new HashSet();
		
		s.add(new Student("rahul", 10));
		s.add(new Student("vishal", 11));
		s.add(new Student("raj", 12));
		s.add(new Student("raj", 12));
		
		System.out.println(s.size());
		System.out.println(s);
	}
}
	

class Student
{
	 String name;
	 int id;
	 
	 Student(String s,int i)
	 {
		 name=s;
		 id=i;
	 }


public boolean equals(Object o)

{
	 if(!(o instanceof Student)) return false;
	 Student s=(Student) o;
	return name.equals(s.name) && id==s.id; 
}

public int hashCode()
{
	return id;
	 
}
public String toString()
{
	return name+","+id;
	 
}
 


}
