package esr;

public interface ISecretary {
	public void editClass(String id, Class cls);
	public void editTeacherSebject(Subject subjectName, Teacher techer);
	public void editStudends(Student student, String login, String name, String surname, String password);
	public void addClass(Class cls);
	public void removeClass(Class cls);
}
