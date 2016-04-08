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

	@Override
	public void editStudends(Student student, String login, String name, String surname, String password) {
		student.setLogin(login);
		student.setName(name);
		student.setPassword(password);
		student.setSurname(surname);
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
