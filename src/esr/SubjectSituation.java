package esr;

import java.util.ArrayList;

public class SubjectSituation {
	private Subject subject = new Subject();
	private ArrayList<Integer> firstSemesterMarks = new ArrayList<Integer>();
	private ArrayList<Integer> secondSemesterMarks = new ArrayList<Integer>();
	private double finalGrade;
	private ArrayList<Absence> absences = new ArrayList<Absence>();

	
	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public ArrayList<Integer> getFirstSemesterMarks() {
		return firstSemesterMarks;
	}

	public void setFirstSemesterMarks(ArrayList<Integer> firstSemesterMarks) {
		this.firstSemesterMarks = firstSemesterMarks;
	}

	public ArrayList<Integer> getSecondSemesterMarks() {
		return secondSemesterMarks;
	}

	public void setSecondSemesterMarks(ArrayList<Integer> secondSemesterMarks) {
		this.secondSemesterMarks = secondSemesterMarks;
	}

	public double getFinalGrade() {
		return finalGrade;
	}

	public void computeFinalGrade() {
		this.finalGrade = (computeFinalGradeSem1() + computeFinalGradeSem2())/2;
	}

	public float computeFinalGradeSem1() {
		float result = 0;
		int sum = 0;
		for (Object o : firstSemesterMarks ) {
			Integer grade = (Integer) o;
			sum += grade;
		}
		result = sum / firstSemesterMarks.size();
		return result;
	}
	
	public float computeFinalGradeSem2() {
		float result = 0;
		int sum = 0;
		for (Object o : secondSemesterMarks ) {
			Integer grade = (Integer) o;
			sum += grade;
		}
		result = sum / secondSemesterMarks.size();
		return result;
	}
	
	public ArrayList<Absence> getAbsences() {
		return absences;
	}

	public void setAbsences(ArrayList<Absence> absences) {
		this.absences = absences;
	}
	
	public void addMarkToSem1(int mark){
		firstSemesterMarks.add(mark);
	}
	public void addMarkToSem2(int mark){
		secondSemesterMarks.add(mark);
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
		return "SubjectSituation [subject=" + subject + ", firstSemesterMarks=" + firstSemesterMarks
				+ ", secondSemesterMarks=" + secondSemesterMarks + ", finalGrade=" + finalGrade + ", absences="
				+ absences + "]";
	}
	

}
