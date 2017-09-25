package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	
	Stack <Character> myStack = new Stack <Character>();

	JFrame f1;
	JPanel p1;
	JLabel l1;
	public static void main(String [] args) {
		TextUndoRedo m = new TextUndoRedo();
			}
	
		TextUndoRedo(){
			f1 = new JFrame();
			p1 = new JPanel();
			l1 = new JLabel();
			f1.add(p1);
			p1.add(l1);
			f1.setVisible(true);
			f1.setSize(500, 500);
			l1.setText("Text:");
			f1.addKeyListener(this);
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
		
		 		
			if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
				 String s = l1.getText();
				 char c = s.charAt(s.length() - 1);
				 myStack.push(c);
				 String y = s.substring(0, s.length() -1);
				 l1.setText(y);
				 
			}
						
			else if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
				 char s = myStack.pop();
				 l1.setText(l1.getText() + s);
				 
			}
			else {
				l1.setText(l1.getText() + e.getKeyChar()); 

			}

		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	
	
}
