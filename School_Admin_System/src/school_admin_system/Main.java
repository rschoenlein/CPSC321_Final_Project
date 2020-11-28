package school_admin_system;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import examples.CardLayoutDemo;

//TODO use CardLayouts(allows panels from other classes(Home, etc..) to be loaded on button clicks, etc...)
public class Main implements ItemListener {
	private JPanel cards;

	// GUI's
	private Home home;
	private static JPanel homePanel;

	private AdminView admin;
	private static JPanel adminPanel;

	private StudentView student;
	private static JPanel studentPanel;

	public Main() {
		
		// TODO create main panel to add/remove cards( home, student, etc.. panels)
		this.home = new Home();
		this.homePanel = home.getHomePanel();

		this.admin = new AdminView();
		this.adminPanel = admin.getAdminPanel();

		this.student = new StudentView();
		this.studentPanel = student.getStudentPanel();
		
		// add components to home screen GUI
		String comboBoxItems[] = { admin.ADMINPANEL, student.STUDENTPANEL };
		JComboBox cb = new JComboBox(comboBoxItems);
		cb.setEditable(false);
		cb.addItemListener(this);
		this.homePanel.add(cb);
		
		 //Create the panel that contains the "cards".
        cards = new JPanel(new CardLayout());
        cards.add(this.adminPanel, admin.ADMINPANEL);
        cards.add(this.studentPanel, student.STUDENTPANEL);
        
        this.homePanel.add(cards, BorderLayout.CENTER);

	}

	private static void createAndShowGUI() {

		JFrame frame = new JFrame("School Admin System");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);

		// Create and set up the content pane.
		Main main = new Main();
		frame.add(homePanel, BorderLayout.CENTER);

		// Display the window.
		frame.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent evt) {
		CardLayout cl = (CardLayout) (cards.getLayout());
		cl.show(cards, (String) evt.getItem());
	}

	public static void main(String[] args) {

		// Schedule a job for the event dispatch thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
