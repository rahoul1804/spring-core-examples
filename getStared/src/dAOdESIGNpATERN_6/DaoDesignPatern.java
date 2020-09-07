package dAOdESIGNpATERN_6;

public class DaoDesignPatern
{
	 public static void main(String[] args) 
	 {
	      StudentDaoInerface studentDao = new StudentDaoImpl();

	      //print all students
	      for (Student student : studentDao.getAllStudents()) 
	      {
	         System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
	      }


	      //update student
	      Student student =studentDao.getAllStudents().get(0);
	      student.setName("Michael");
	      studentDao.updateStudent(student);

	      //get the student
	      studentDao.getStudent(0);
	      System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");		
	   }
	}