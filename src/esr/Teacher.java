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
	public ArrayList<Student> ListOfStudents(Class c) {
		return c.getStudents();
	}

	@Override
	public void GiveMarkToSem1(int mark, Student s) {
		
		Class clsSearched = new Class();
		
		for(Object o : AuxClass.getCentralizer().getAllClasses()) {
			Class c = (Class) o;
			if( c.getStudents().contains(s) == true) {
				clsSearched = c;
			clsSearched.getRegister().getSubjectSituation(s, this.getSubjectName()).addMarkToSem1(mark);
			}
		}
	}
	@Override
	public void GiveMarkToSem2(int mark, Student s) {
		Class clsSearched = new Class();
		
		for(Object o : AuxClass.getCentralizer().getAllClasses()) {
			Class c = (Class) o;
			if( c.getStudents().contains(s) == true) {
				clsSearched = c;
			clsSearched.getRegister().getSubjectSituation(s, this.getSubjectName()).addMarkToSem2(mark);
			}
		}
	}

	@Override
	public void GiveFinalGrade(Student s) {
		Class clsSearched = new Class();
		
		for(Object o : AuxClass.getCentralizer().getAllClasses()) {
			Class c = (Class) o;
			if( c.getStudents().contains(s) == true) {
				clsSearched = c;
				clsSearched.getRegister().getSubjectSituation(s, this.getSubjectName()).computeFinalGradeSem1();
				clsSearched.getRegister().getSubjectSituation(s, this.getSubjectName()).computeFinalGradeSem2();
				clsSearched.getRegister().getSubjectSituation(s, this.getSubjectName()).computeFinalGrade();
			}
		}
	}

	@Override
	public void CheckAbsence(String date, Student s) {
		Class clsSearched = new Class();
		
		for(Object o : AuxClass.getCentralizer().getAllClasses()) {
			Class c = (Class) o;
			if( c.getStudents().contains(s) == true) {
				clsSearched = c;
				clsSearched.getRegister().getSubjectSituation(s, this.getSubjectName()).addAbsence(date);
			}
		}
	}
}
