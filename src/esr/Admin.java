package esr;

import java.util.ArrayList;

public class Admin extends User implements IAdmin {

	public User AddUser(String userType)
	  {
	    if ( userType.equals("student") ) {
	    	Student s = new Student();
	    	AuxClass.getCentralizer().getAllUsers().add(s);
	    	AuxClass.getCentralizer().getAllStudents().add(s);
	    	return s;
	    }
	    else if ( userType.equals("teacher") ) {
	    	Teacher t = new Teacher();
	    	AuxClass.getCentralizer().getAllUsers().add(t);
	    	AuxClass.getCentralizer().getAllTeachers().add(t);
	    	return t;
	    }
	    else if ( userType.equals("seretary") ) {
	    	Secretary se = new Secretary();
	    	AuxClass.getCentralizer().getAllUsers().add(se);
	    	AuxClass.getCentralizer().getAllSecretaries().add(se);
	    	return se;
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
