package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener{
	Stack<String> s = new Stack<String>();
	Stack<Character> user = new Stack<Character>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	String underscore = new String();
	String line = new String();
	int lives = 10;
	String word;
	String dictionary;
	int words;
	char c;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static void main(String[] args) {
		HangMan h = new HangMan();
		h.run();
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

	void run() {
		frame.add(panel);
		panel.add(label);
		frame.pack();
		frame.setVisible(true);
		frame.addKeyListener(this);
		
		words = Integer.parseInt(JOptionPane.showInputDialog("How many words do you want to spell?"));
		for (int i = 0; i < words; i++) {
			s.push(Utilities.readRandomLineFromFile("dictionary.txt"));
		}
		word = s.pop();
		
		System.out.println(word);
		for (int j = 0; j < word.length(); j++) {
			underscore+="_";
		}
		label.setText(underscore + " Lives: " + lives);
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println(e.getKeyChar());
		c = e.getKeyChar();
		user.push(c);

		if (word.contains(e.getKeyChar()+"")) {
			word.indexOf(e.getKeyChar());
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
		
		String input = "";
		for (int i = 0; i < user.size(); i++) {
			input += String.valueOf(user.pop());
		}
		System.out.println(input);
		if (!underscore.contains("_") && lives > 0 && words > 1) {
			JOptionPane.showMessageDialog(null, "YoU'vE gUesSeD tHe wOrD!");
			label.setText(underscore + "\n Lives: " + lives);
			if (words > 1) {
				lives = 10;
				System.out.println(dictionary);
				for (int i = 0; i < dictionary.length(); i++) {
					line+="_";
					label.setText("");
					label.setText(line + " Lives: " + lives);
				}
				if (dictionary.contains(e.getKeyChar()+"")) {
					dictionary.indexOf(e.getKeyChar());
					String newunderscore = "";
					for (int i = 0; i < dictionary.length(); i++) {
						if (dictionary.charAt(i) == e.getKeyChar()) {
							newunderscore+=e.getKeyChar();
						}else {
							newunderscore+=line.charAt(i);
						}
					}
					line = newunderscore;
					label.setText(line);
				}else {
					lives--;
				}
				label.setText(line + "\n Lives: " + lives);
				if (!line.contains("_") && lives > 0) {
					lives = 10;
					JOptionPane.showMessageDialog(null, "YoU'vE gUesSeD tHe wOrD!");
				}
			}
			
		}
		
		if (!underscore.contains("_") && lives > 0 && words == 1) {
			JOptionPane.showConfirmDialog(null, "YoU'vE gUesSeD tHe wOrD! Do YoU wAnT tO pLaY aGaIn?");
		}
		else if (lives == 0) {
			JOptionPane.showConfirmDialog(null, "gAmE OveR! dO yOu WaNt To tRy AgAiN?");
			s.pop();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
