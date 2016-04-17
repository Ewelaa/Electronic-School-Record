package esr;

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
	
	
}
