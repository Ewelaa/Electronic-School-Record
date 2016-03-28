package esr;

import java.util.ArrayList;

public class SubjectSituation {
	private Subject subject = new Subject();
	ArrayList<Integer> firstSemestrMarks = new ArrayList<Integer>();
	ArrayList<Integer> secondSemestrMarkss = new ArrayList<Integer>();
	private double finalGrade;
	ArrayList<Absence> absences = new ArrayList<Absence>();

	public void computeFinalGrade(){
		this.finalGrade = 5;  //some math will be add soon :)
	}
	
	public void addMarkToSem1(int mark){
		firstSemestrMarks.add(mark);
	}
	public void addMarkToSem2(int mark){
		secondSemestrMarkss.add(mark);
	}
	
	public void addAbsence(String absenceDate){
	absences.add(new Absence(absenceDate));
	}
	
	class Absence {
		private String absenceDate;
		
		public Absence(String absenceDate){
			this.absenceDate = absenceDate;
		}
	}

	public String toString() {
		return "SubjectSituation [subject=" + subject + ", firstSemestrMarks=" + firstSemestrMarks
				+ ", secondSemestrMarkss=" + secondSemestrMarkss + ", finalGrade=" + finalGrade + ", absences="
				+ absences + "]";
	}
	

}
