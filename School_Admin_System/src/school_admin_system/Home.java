package school_admin_system;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

//TODO make pane property
public class Home {
	private JLabel welcomeLabel;
	
	public Home() {
		welcomeLabel = new JLabel("<html><h1 style=\"text-align:center;\">Welcome</h1><br>Please enter your information below");
	}

	public JLabel getWelcomeLabel() {
		return welcomeLabel;
	}
}
