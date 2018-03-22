package lab02;

import javax.swing.JOptionPane;

public class labGUI {
	
	public static void main(String[] args)
	
	{
	
		
		String phrase1  = JOptionPane.showInputDialog("Please Enter the First string");

        String phrase2   = JOptionPane.showInputDialog("Please Enter the Second String");



            if(phrase1.length()>phrase2.length())
            {
            	JOptionPane.showMessageDialog(null, "The Largest String is " +phrase1, phrase2, 0);
            }
            else
            {
             JOptionPane.showMessageDialog(null, "The Largest String is " +phrase2, phrase1, 0);
            }
       
        }
		 
	}
	
	
	
	


