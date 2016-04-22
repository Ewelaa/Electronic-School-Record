package esr;


public class Student extends User implements IStudent {

	@Override
	public void ViewDeatalis() {
		Class clsSearched = new Class();
	
		for(Object o : AuxClass.getCentralizer().getAllClasses()) {
			Class c = (Class) o;
			if( c.getStudents().contains(this) == true) {
				clsSearched = c;
				System.out.println(clsSearched.getClassID().toString());
			}
			
		}
		
		for(Object o : clsSearched.getSubjects()) {
			Subject s = (Subject) o;
			System.out.println(clsSearched.getRegister().getSubjectSituation(this, s).getFirstSemesterMarks().toString());
			System.out.println(clsSearched.getRegister().getSubjectSituation(this, s).getSecondSemesterMarks().toString());
			System.out.println(clsSearched.getRegister().getSubjectSituation(this, s).getFinalGrade());
		}
}
	@Override
	public void ViewSchoolSituation() {
		


	}

}
