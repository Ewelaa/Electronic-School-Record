package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.LineNumberReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Log extends JFrame implements ActionListener {
	    
    public Log() {    
        JFrame frame = new JFrame("Electronic School Register - LogIn panel");
        frame.setSize(450, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        

        JPanel panel = new JPanel();    
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

        panel.setLayout(null);

        JLabel userLabel = new JLabel("User");
        
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        JButton loginButton = new JButton("logIn");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		String username = userText.getText();
		String password = passwordText.getText();
		
		LineNumberReader lnr = new LineNumberReader(new FileReader("list.txt"));
		String line = lnr.readLine();
		while((line) != null) {
			String [] word = line.split(" ");
			if (word[0].equals(username) && word[1].equals(password)) {
				if (word[2].equals("administrator")) {
					PageAdmin pa = new PageAdmin();
					pa.setVisible();
				}
			}
		}
	}
}
