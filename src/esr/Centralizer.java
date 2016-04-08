package esr;

import java.util.ArrayList;
import java.util.HashMap;

public class Centralizer {
	
	private static Centralizer firstInstance = null;
	private ArrayList<User> allUsers = new ArrayList<User>();
	private ArrayList<Student> allStudents = new ArrayList<Student>();
	private ArrayList<Teacher> allTeachers = new ArrayList<Teacher>();
	private ArrayList<Secretary> allSecretaries = new ArrayList<Secretary>();
	private ArrayList<Admin> allAdmins = new ArrayList<Admin>();
	private ArrayList<Class> allClasses = new ArrayList<Class>();
	private HashMap<Subject, HashMap<Class, Teacher>> subjectClassDictionary = 
			new HashMap<Subject, HashMap<Class, Teacher>>();
	
//---------------------------------Getters & Setters--------------------------------------
	
	public ArrayList<User> getAllUsers() {
		return allUsers;
	}

	public void setAllUsers(ArrayList<User> allUsers) {
		this.allUsers = allUsers;
	}

	public ArrayList<Student> getAllStudents() {
		return allStudents;
	}

	public void setAllStudents(ArrayList<Student> allStudents) {
		this.allStudents = allStudents;
	}

	public ArrayList<Teacher> getAllTeachers() {
		return allTeachers;
	}

	public void setAllTeachers(ArrayList<Teacher> allTeachers) {
		this.allTeachers = allTeachers;
	}

	public ArrayList<Secretary> getAllSecretaries() {
		return allSecretaries;
	}

	public void setAllSecretaries(ArrayList<Secretary> allSecretaries) {
		this.allSecretaries = allSecretaries;
	}

	public ArrayList<Admin> getAllAdmins() {
		return allAdmins;
	}

	public void setAllAdmins(ArrayList<Admin> allAdmins) {
		this.allAdmins = allAdmins;
	}

	public ArrayList<Class> getAllClasses() {
		return allClasses;
	}

	public void setAllClasses(ArrayList<Class> allClasses) {
		this.allClasses = allClasses;
	}

	public HashMap<Subject, HashMap<Class, Teacher>> getSubjectClassDictionary() {
		return subjectClassDictionary;
	}

	public void setSubjectClassDictionary(HashMap<Subject, HashMap<Class, Teacher>> subjectClassDictionary) {
		this.subjectClassDictionary = subjectClassDictionary;
	}
//---------------------------------Methods--------------------------------------
	private Centralizer() {	}

	public static Centralizer getInstance() {
			if(firstInstance == null){
				firstInstance = new Centralizer();			
			}
			return firstInstance;
	}
	
}
