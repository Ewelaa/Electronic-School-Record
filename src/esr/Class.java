package esr;

import java.util.ArrayList;

public class Class {
	
	private String classID;
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Subject> subjects = new ArrayList<Subject>();
	private Register register = new Register();
	
	
	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public ArrayList<Subject> getSubjects() {
		return subjects;
	}


	public void setSubjects(ArrayList<Subject> subjects) {
		this.subjects = subjects;
	}


	public Register getRegister() {
		return register;
	}

	public void setRegister(Register register) {
		this.register = register;
	}

	public String getClassID() {
		return classID;
	}

	public void setClassID(String classID) {
		this.classID = classID;
	}
	
	public void addStudentToClass(Student student){
		students.add(student);
	}
	public void removeStudentFromClass(Student student){
		students.remove(student);
	}

	public void addSubjectToClass(Subject subject){
		subjects.add(subject);
	}
	public void removeSubjectFromClass(Subject subject){
		subjects.remove(subject);
	}

	public String toString() {
		return "Class [classID=" + classID + ", students=" + students + ", subjects=" + subjects + ", register="
				+ register + "]";
	}
	
	
}
