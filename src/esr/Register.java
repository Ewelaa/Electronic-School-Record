package esr;

import java.util.ArrayList;
import java.util.HashMap;

public class Register {
	
	private HashMap<Student, HashMap<Subject, SubjectSituation>> studentSubjectDictionary = 
			new HashMap<Student, HashMap<Subject, SubjectSituation>>();

	public HashMap<Student, HashMap<Subject, SubjectSituation>> getStudentSubjectDictionary() 
	{
		return studentSubjectDictionary;
	}

	public void setStudentSubjectDictionary(HashMap<Student, HashMap<Subject, SubjectSituation>> studentSubjectDictionary) 
	{
		this.studentSubjectDictionary = studentSubjectDictionary;
	}
	
	public SubjectSituation getSubjectSituation(Student s, Subject sub){
		SubjectSituation subs = new SubjectSituation();
		HashMap<Subject, SubjectSituation> hash = studentSubjectDictionary.get(s);
		subs = hash.get(sub);
		return subs;
	}
	
	public void removeStudent(Student s){
		studentSubjectDictionary.remove(s);
	}

	public void addStudent(Student student, Class cls) {
		ArrayList<Subject> subjects = cls.getSubjects();
		HashMap<Subject, SubjectSituation> hash = new HashMap<Subject, SubjectSituation>();
		for(Object e : subjects) {
			Subject s = (Subject) e; //key
			SubjectSituation sit = new SubjectSituation(); //value
			hash.put(s, sit);		
		}
		studentSubjectDictionary.put(student, hash);
	}

	
	
}
