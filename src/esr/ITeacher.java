package esr;

import java.util.ArrayList;

public interface ITeacher {
	public ArrayList<Student> ListOfStudents();
	public void GiveMark( int mark);
	public void GiveFinalGrade();
	public void CheckAbsence();
}
