package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame f1;
	JPanel p1;
	JButton b1;
	JButton b2;
	ArrayList<String> guestList = new ArrayList<String>();
	String i;
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	public static void main(String [] args) {
		GuestBook m = new GuestBook(); 

		
		
	}
	
	GuestBook(){
		
		
		f1 = new JFrame();
		p1  = new JPanel();
		b1 = new JButton();
		b2 = new JButton();
		f1.add(p1);
		p1.add(b1);
		p1.add(b2);
		f1.setVisible(true);
		f1.setSize(500, 500);
		b1.setText("Add Name");
		b2.setText("View Names");
		b1.addActionListener(this);
		b2.addActionListener(this);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			 i = JOptionPane.showInputDialog("What name would you like to add Monsieur?");
			guestList.add(i);
		}
		if(e.getSource() == b2) {
			int i = 1;
			String s2 = "";
			
			for(String s : guestList){
				//System.out.println("Guest #" + i + " " + s);
				s2 += "Guest #" + i + " " + s + "\n";
				
				i += 1;
			}
			JOptionPane.showMessageDialog(null, s2);
		//	JOptionPane.showMessageDialog(null, "" + guestList);
		}
		
	}
}
