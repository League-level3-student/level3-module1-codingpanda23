package _04_HangMan;

import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan{
	static Stack<String> s = new Stack<String>();
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JLabel label = new JLabel();
	static String underscore = new String();
	
	public static void main(String[] args) {
		frame.add(panel);
		panel.add(label);
		frame.setVisible(true);
		frame.pack();
		
		int words = Integer.parseInt(JOptionPane.showInputDialog("How many words do you want to spell?"));
		for (int i = 0; i < words; i++) {
			s.push(Utilities.readRandomLineFromFile("dictionary.txt"));
			String next = new String();
			if (!s.contains(next)) {
				s.add(next);
				i++;
				underscore+="_";
			}
		}
		
		s.pop();
		
	}
	
	
}
