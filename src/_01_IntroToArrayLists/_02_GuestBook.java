package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JButton button = new JButton();
	JButton button1 = new JButton();

	ArrayList<String> guests = new ArrayList<String>();

	public void createUI() {

		button.setText("Add Name");
		button1.setText("View Names");
		frame.add(panel);
		panel.add(button);
		panel.add(button1);
		frame.setVisible(true);
		frame.pack();
		button.addActionListener(this);
		button1.addActionListener(this);

	}

	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	public static void main(String[] args) {
		_02_GuestBook guestBook = new _02_GuestBook();
		guestBook.createUI();

		// Guest #1: Bob Banders
		// Guest #2: Sandy Summers
		// Guest #3: Greg Ganders
		// Guest #4: Donny Doners
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			String name = JOptionPane.showInputDialog("Give me a NAME:");
			guests.add(name);
		}

		if (e.getSource() == button1) {
			String people = "";
			for (int i = 0; i < guests.size(); i++) {
				people += "Guest #" + (i + 1) + ": " + guests.get(i) + "\n";

			}
			JOptionPane.showMessageDialog(null, people);
		}
	}
}