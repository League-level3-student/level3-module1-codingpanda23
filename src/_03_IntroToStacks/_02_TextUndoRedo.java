package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener{

	 // Create a JFrame with a JPanel and a JLabel.
	  	JFrame frame = new JFrame();
	  	JPanel panel = new JPanel();
	  	JLabel label = new JLabel();
	  	Stack<Character> c = new Stack<Character>();
	 // Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	  	
	 // Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 // Save that deleted character onto a Stack of Characters.
	  
	 // Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 // off the Stack and added back to the JLabel.
	  
	
	public void createUI() {
		frame.add(panel);
		panel.add(label);
		frame.setVisible(true);
		frame.pack();
		frame.addKeyListener(this);
		
		
	}
	
	public static void main(String[] args) {
		_02_TextUndoRedo text = new _02_TextUndoRedo();
		text.createUI();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		String s = label.getText();
		label.setText(s+e.getKeyChar());
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			c.push(s.charAt(s.length()-1));
			label.setText(s.substring(0, s.length()-1));
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			label.setText(s+c.pop());
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
