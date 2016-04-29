package esr;

import java.util.ArrayList;

public class Admin extends User implements IAdmin {

	public User AddUser(String userType)
	  {
	    if ( userType.equals("student") ) {
	    	AuxClass.getCentralizer().getAllUsers().add(new Student());
	    	AuxClass.getCentralizer().getAllStudents().add(new Student());
	    	return new Student();
	    }
	    else if ( userType.equals("teacher") ) {
	    	AuxClass.getCentralizer().getAllUsers().add(new Teacher());
	    	AuxClass.getCentralizer().getAllTeachers().add(new Teacher());
	    	return new Teacher();
	    }
	    else if ( userType.equals("seretary") ) {
	    	AuxClass.getCentralizer().getAllUsers().add(new Secretary());
	    	AuxClass.getCentralizer().getAllSecretaries().add(new Secretary());
	    	return new Secretary();
	    }
	    return null;
	  }

	public void RemoveUser(User user) {
		AuxClass.getCentralizer().getAllUsers().remove(user);
	}
	
	public ArrayList<User> showListOfUsers() {
		//System.out.println((AuxClass.getCentralizer()).getAllUsers());
		return AuxClass.getCentralizer().getAllUsers() ;
	}

}
