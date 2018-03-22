package lab02;

import javax.swing.JOptionPane;

public class DeleteLetter {
	
	public static void main(String[] args)
	{
		String word  = JOptionPane.showInputDialog("Please Enter a string");
		String deleteword = JOptionPane.showInputDialog("Please Enter the word you would like to truncate");
		int wordindex = word.indexOf(deleteword);
		word = word.substring(0,wordindex);
		JOptionPane.showMessageDialog(null, word);
		
	}
	
	
}
