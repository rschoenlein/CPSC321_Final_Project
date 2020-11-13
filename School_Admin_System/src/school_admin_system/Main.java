package school_admin_system;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

//TODO change this to CardLayouts(allows panels from other classes(Home, etc..) to be loaded on button clicks, etc...)
public class Main {
	private Home home;
	private static JLabel welcomeLabel;
	
	public Main() {
		this.home = new Home();
		this.welcomeLabel = new JLabel(home.getWelcomeLabel().getText());
		this.welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
	}
	
	public static void main(String args[]) {
		Main main = new Main();
		JFrame frame = new JFrame("School Admin System");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.add(welcomeLabel, BorderLayout.CENTER);
		frame.setVisible(true);
	}
}
