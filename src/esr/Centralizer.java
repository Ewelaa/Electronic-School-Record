package esr;

import java.util.ArrayList;
import java.util.HashMap;

public class Centralizer {
	
	private static Centralizer firstInstance = null;
	public ArrayList<User> allUsers = new ArrayList<User>();
	public ArrayList<Student> allStudents = new ArrayList<Student>();
	public ArrayList<Teacher> allTeachers = new ArrayList<Teacher>();
	public ArrayList<Secretary> allSecretaries = new ArrayList<Secretary>();
	public ArrayList<Admin> allAdmins = new ArrayList<Admin>();
	public ArrayList<Class> allClasses = new ArrayList<Class>();
	
	HashMap<Subject, HashMap<Class, Teacher>> subjectClassDictionary = 
			new HashMap<Subject, HashMap<Class, Teacher>>();
	
	private Centralizer() {	}
	
	public static Centralizer getInstance(){
		if(firstInstance == null){
			firstInstance = new Centralizer();			
		}
		return firstInstance;
	}
	
	
	

	
	

}
