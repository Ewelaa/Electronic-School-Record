package esr;

import java.util.ArrayList;

public class Teacher extends User implements ITeacher{
	
	private Subject subjectName;

	public Subject getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(Subject subjectName) {
		this.subjectName = subjectName;
	}

	@Override
	public ArrayList<Student> ListOfStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void GiveMark(int mark) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void GiveFinalGrade() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CheckAbsence() {
		// TODO Auto-generated method stub
		
	}
	
}
