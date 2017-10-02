package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {
	/*
	 * Create a HashMap of Integers for the keys and Strings for the values. Create
	 * a GUI with three buttons. Button 1: Add Entry When this button is clicked,
	 * use an input dialog to ask the user to enter an ID number. After an ID is
	 * entered, use another input dialog to ask the user to enter a name. Add this
	 * information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 *
	 */
	JFrame f1;
	JPanel p1;
	JButton AddEntry;
	JButton SearchID;
	JButton ViewList;

	public static void main(String[] args) {

		LogSearch m = new LogSearch();
	}

	LogSearch() {
		f1 = new JFrame();
		p1 = new JPanel();
		AddEntry = new JButton();
		SearchID = new JButton();
		ViewList = new JButton();
		f1.add(p1);
		p1.add(AddEntry);
		p1.add(SearchID);
		p1.add(ViewList);
		f1.setVisible(true);
		f1.setSize(500, 500);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AddEntry.setText("Add Entry");
		SearchID.setText("Search by ID");
		ViewList.setText("View List");
		AddEntry.addActionListener(this);
		SearchID.addActionListener(this);
		ViewList.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		HashMap<Integer, String> Search = new HashMap<Integer, String>();
		// TODO Auto-generated method stub
		if (e.getSource() == AddEntry) {
			String x = JOptionPane.showInputDialog("Enter an ID Number please");
			String y = JOptionPane.showInputDialog("Enter a Name please");
			int p = Integer.parseInt(x);
			Search.put(p, y);
		}
		if (e.getSource() == SearchID) {
			String q = JOptionPane.showInputDialog("Enter an ID Number");
			Integer n = Integer.parseInt(q);
			System.out.println(n);
			System.out.println(Search);
			if (Search.keySet().contains(n)) {
				System.out.println(Search.get(n));
			}
			else {
				JOptionPane.showMessageDialog(null, "Does not have designated ID Number");
			}
		}
	}
}
