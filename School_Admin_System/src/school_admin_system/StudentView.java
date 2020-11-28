package school_admin_system;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class StudentView {
	//TODO add cards panel to load different panels onto studentPanel depending on user input 
	//TODO build gui
	
	private JLabel welcomeLabel;
	private JPanel studentPanel;
	final static String	STUDENTPANEL = "Student Screen Card";

	public StudentView() {
		//create GUI elements
		welcomeLabel = new JLabel("<html><h1 style=\"text-align:center;\">Student</h1><br>Hello Student");
		welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
		
		//add to panel
		studentPanel = new JPanel();
		studentPanel.add(welcomeLabel);
	}

	public JLabel getWelcomeLabel() {
		return welcomeLabel;
	}
	
	public JPanel getStudentPanel() {
		return studentPanel;
	}
}
