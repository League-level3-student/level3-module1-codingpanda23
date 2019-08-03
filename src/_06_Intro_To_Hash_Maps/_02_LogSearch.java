package _06_Intro_To_Hash_Maps;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements MouseListener{
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an
	 * 				input dialog. If this ID exists in the HashMap, remove it. Otherwise,
	 * 				notify the user that the ID is not in the list. 
	 *
	 * */
	
	HashMap<Integer, String> hash = new HashMap<Integer, String>();
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addEntry = new JButton();
	JButton searchID = new JButton();
	JButton viewList = new JButton();
	JButton remove = new JButton();
	
	public void GUI(){
		frame.add(panel);
		panel.add(addEntry);
		panel.add(searchID);
		//panel.add(viewList);
		//panel.add(remove);
		
		addEntry.setText("Add Entry");
		searchID.setText("Search by ID");
		//viewList.setText("View List");
		//remove.setText("Remove Entry");
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//Button 1:
		if (e.getSource() == addEntry) {
			String s = JOptionPane.showInputDialog("Please enter an ID number.");
			int ID = Integer.parseInt(s);
			
			String name = JOptionPane.showInputDialog("Please enter a name.");
			
			hash.put(ID, name);
		}
		//Button 2:
		if (e.getSource() == searchID) {
			
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
