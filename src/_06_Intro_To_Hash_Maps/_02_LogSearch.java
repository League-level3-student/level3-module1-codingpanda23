package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener{
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
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addEntry = new JButton();
	JButton searchID = new JButton();
	JButton viewList = new JButton();
	//JButton remove = new JButton();
	
	HashMap<Integer, String> hash = new HashMap<Integer, String>();
	
	public void createGUI(){
		frame.add(panel);
		frame.setVisible(true);
		panel.add(addEntry);
		panel.add(searchID);
		panel.add(viewList);
		//panel.add(remove);
		
		addEntry.setText("Add Entry");
		searchID.setText("Search by ID");
		viewList.setText("View List");
		//remove.setText("Remove Entry");
		
		addEntry.addActionListener(this);
		searchID.addActionListener(this);
		viewList.addActionListener(this);
		//remove.addActionListener(this);
		
		frame.pack();
	}

	public static void main(String[] args) {
		_02_LogSearch logsearch = new _02_LogSearch();
		logsearch.createGUI();
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//Button 1:
		if (e.getSource() == addEntry) {
			String s = JOptionPane.showInputDialog("Please enter an ID number to log.");
			int ID = Integer.parseInt(s);
					
			String name = JOptionPane.showInputDialog("Please enter a name to associate to the ID.");
					
			hash.put(ID, name);
		}
		//Button 2:
		if (e.getSource() == searchID) {
			String sea = JOptionPane.showInputDialog("Please enter an ID number to search for.");
			int search = Integer.parseInt(sea);
			if (hash.containsKey(search)) {
				JOptionPane.showMessageDialog(null, "The name " + hash.get(search) + " goes with ID #" + search);
			}else {
				JOptionPane.showMessageDialog(null, "This entry does not exist.");
			}
		}
		//Button 3:
		if (e.getSource() == viewList) {
			String people = "";
			for (int i = 0; i < hash.size(); i++) {
				people += "ID: " + hash.get(hash.keySet()) + "    Name: " + hash.get(hash.values());
			}
			JOptionPane.showMessageDialog(null, people);
		}
		//Button 4:
		/*if (e.getSource() == remove) {
			String r = JOptionPane.showInputDialog("Enter an ID you want to remove.");
			int rem = Integer.parseInt(r);
			if (hash.containsKey(rem)) {
				hash.remove(rem);
				JOptionPane.showMessageDialog(null, "The ID number " + r + " has been removed");
			}else {
				JOptionPane.showMessageDialog(null, "This ID doesn't exist.");
			}
			
		}*/
	}
	
}
