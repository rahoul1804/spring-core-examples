package dAOdESIGNpATERN_6;

import java.util.List;

public interface StudentDaoInerface 
{
   public List<Student> getAllStudents();
   
   public Student getStudent(int rollNo);
   public void updateStudent(Student student);
   public void deleteStudent(Student student);
}