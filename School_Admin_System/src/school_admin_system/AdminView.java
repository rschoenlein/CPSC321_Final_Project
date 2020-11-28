package school_admin_system;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdminView {
	//TODO add cards panel to load different panels onto studentPanel depending on user input 
	//TODO build gui
	
	private JLabel welcomeLabel;
	private JPanel adminPanel;
	final static String	ADMINPANEL = "Admin Screen Card";

	public AdminView() {
		//create GUI elements
		welcomeLabel = new JLabel("<html><h1 style=\"text-align:center;\">Admin</h1><br>Hello Admin");
		welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
		
		//add to panel
		adminPanel = new JPanel();
		adminPanel.add(welcomeLabel);
	}

	public JLabel getWelcomeLabel() {
		return welcomeLabel;
	}
	
	public JPanel getAdminPanel() {
		return adminPanel;
	}
}
