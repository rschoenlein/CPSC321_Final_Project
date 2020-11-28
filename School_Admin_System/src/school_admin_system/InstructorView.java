package school_admin_system;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class InstructorView {
	//TODO add cards panel to load different panels onto studentPanel depending on user input 
		//TODO build gui
		
		private JLabel welcomeLabel;
		private JPanel instructorPanel;

		public InstructorView() {
			//create GUI elements
			welcomeLabel = new JLabel("<html><h1 style=\"text-align:center;\">Instructor</h1><br>Hello Instructor");
			welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
			
			//add to panel
			instructorPanel = new JPanel();
			instructorPanel.add(welcomeLabel);
		}

		public JLabel getWelcomeLabel() {
			return welcomeLabel;
		}
		
		public JPanel getInstructorPanel() {
			return instructorPanel;
		}
}
