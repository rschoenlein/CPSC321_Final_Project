package school_admin_system;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Home {
	private JLabel welcomeLabel;
	private JPanel homePanel;
	final static String	HOMEPANEL = "Home Screen Card";

	public Home() {
		//create GUI elements
		welcomeLabel = new JLabel("<html><h1 style=\"text-align:center;\">Welcome</h1><br>Please enter your information below");
		welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
		
		//add to panel
		homePanel = new JPanel();
		homePanel.add(welcomeLabel);
	}

	public JLabel getWelcomeLabel() {
		return welcomeLabel;
	}
	
	public JPanel getHomePanel() {
		return homePanel;
	}
}
