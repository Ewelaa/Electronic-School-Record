package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

import esr.Admin;
import esr.AuxClass;
import esr.Secretary;
import esr.Student;
import esr.Teacher;

public class Gui {
	
	public static void main(String [] args) throws IOException {

		File f = new File("list.txt");
		AuxClass ac = new AuxClass();
		if(f.exists() == false) {
			Admin admin = new Admin();
			admin.setName("admin");
			admin.setPassword("admin");
			//add to centralizer
			AuxClass.getCentralizer().getAllUsers().add(admin);
			AuxClass.getCentralizer().getAllAdmins().add(admin);
			FileWriter fw = new FileWriter("list.txt", true); //true is for append
			fw. write(admin.getName() + " " + admin.getPassword() + " " + "administrator" + "\n");
			fw.close();
		}
		else {
			LineNumberReader lnr = new LineNumberReader (new FileReader("list.txt"));
			String line;
			while((line = lnr.readLine())!= null) {
				String [] words = line.split(" ");
							
				if (words[2].equals("adminstrator")) {
					Admin admin = new Admin();
					admin.setName(words[0]);
					admin.setPassword(words[1]);
					AuxClass.getCentralizer().getAllUsers().add(admin);
					AuxClass.getCentralizer().getAllAdmins().add(admin);
				}
				if (words[2].equals("student")) {
					Student s = new Student();
					s.setName(words[0]);
					s.setPassword(words[1]);
					AuxClass.getCentralizer().getAllUsers().add(s);
					AuxClass.getCentralizer().getAllStudents().add(s);
				}
				if (words[2].equals("teacher")) {
					Teacher t = new Teacher();
					t.setName(words[0]);
					t.setPassword(words[1]);
					AuxClass.getCentralizer().getAllUsers().add(t);
					AuxClass.getCentralizer().getAllTeachers().add(t);
				}
				if (words[2].equals("secretary")) {
					Secretary se = new Secretary();
					se.setName(words[0]);
					se.setPassword(words[1]);
					AuxClass.getCentralizer().getAllUsers().add(se);
					AuxClass.getCentralizer().getAllSecretaries().add(se);
				}
			}
			lnr.close();
		}	
		Log log = new Log();
		log.setVisible(true);
	}
	
}
