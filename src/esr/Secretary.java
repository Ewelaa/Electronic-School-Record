package esr;

public class Secretary extends User implements ISecretary {

	@Override
	public void editClass(String id, Class cls) {
		cls.setClassID(id);
	}

	@Override
	public void editTeacherSebject(Subject subjectName, Teacher teacher) {
		teacher.setSubjectName(subjectName); 
	}
	public void addSubjectToClass(Subject s, Class c){
		c.getSubjects().add(s);
	}
	public void removeSubjectFromClass(Subject s, Class c){
		c.getSubjects().remove(s);
	}
	
	public void editSubject(Subject s, int nrOfHours, String subjectName) {
		s.setName(subjectName);
		s.setNumberOfHours(nrOfHours);
	}
			
	@Override
	public void editStudends(Student student, String login, String name, String surname, String password) {
		student.setLogin(login);
		student.setName(name);
		student.setPassword(password);
		student.setSurname(surname);
	}
	public void addStudentToClass(Student s, Class c) {
		c.addStudentToClass(s);
	}
	
	public void removeStudentFromClass(Student s, Class c) {
		c.removeStudentFromClass(s);
	}
	

	@Override
	public void addClass(Class cls) {
		cls = new Class();
		AuxClass.getCentralizer().getAllClasses().add(cls);
	}

	@Override
	public void removeClass(Class cls) {
		AuxClass.getCentralizer().getAllClasses().remove(cls);
	}
	
	
	
}
