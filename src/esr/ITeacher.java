package esr;

import java.util.ArrayList;

public interface ITeacher {
	public ArrayList<Student> ListOfStudents(Class c);
	public void GiveMarkToSem1( int mark, Student s, Class c);
	public void GiveMarkToSem2( int mark, Student s, Class c);
	public void GiveFinalGrade(Student s, Class c);
	public void CheckAbsence(String date, Student s, Class c);
}
