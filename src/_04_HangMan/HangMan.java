package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener{
	static Stack<String> s = new Stack<String>();
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JLabel label = new JLabel();
	static String underscore = new String();
	static int lives = 10;
	static String word;
	
	public static void main(String[] args) {
		HangMan h = new HangMan();
		h.run();
		
	}
	
	void run() {
		frame.add(panel);
		panel.add(label);
		frame.pack();
		frame.setVisible(true);
		frame.addKeyListener(this);
			
		int words = Integer.parseInt(JOptionPane.showInputDialog("How many words do you want to spell?"));
		for (int i = 0; i < words; i++) {
			s.push(Utilities.readRandomLineFromFile("dictionary.txt"));
		}
		
		for (int i = 0; i < words; i++) {
			word = s.pop();
			System.out.println(word);
			for (int j = 0; j < word.length(); j++) {
				underscore+="_";
			}
			label.setText(underscore + "\n Lives: " + lives);
		}
		
		
		
		
		
	}
		
		
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println(e.getKeyChar());
		
		if (word.contains(e.getKeyChar()+"")) {
			int w = word.indexOf(e.getKeyChar());
			String newunderscore = "";
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == e.getKeyChar()) {
					newunderscore+=e.getKeyChar();
				}else {
					newunderscore+=underscore.charAt(i);
				}
			}
			underscore = newunderscore;
			label.setText(underscore);
		}else {
			lives--;
		}
		label.setText(underscore + "\n Lives: " + lives);
		
		if (!underscore.contains("_") && lives != 0) {
			JOptionPane.showMessageDialog(null, "You've guessed the word!");
			label.setText(underscore + "\n Lives: " + lives);
		}
		else if (lives == 0) {
			JOptionPane.showMessageDialog(null, "Game Over");
			s.pop();
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
