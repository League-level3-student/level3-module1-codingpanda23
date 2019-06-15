package _04_HangMan;

import java.util.Stack;

import javax.swing.JOptionPane;

public class HangMan{
	Stack<String> s = new Stack<String>();
	
	public static void main(String[] args) {
		int words = Integer.parseInt(JOptionPane.showInputDialog("How many words do you want to spell?"));
		for (int i = 0; i < words; i++) {
			//s.push(readRandomLineFromFile("dictionary.txt"));
		}
	}
	
	
}
