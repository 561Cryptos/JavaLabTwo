package lab02;

import javax.swing.JOptionPane;

public class ReplaceWithSpaces 
{
	public static void main(String []  args)
	{
		String phrase1  = JOptionPane.showInputDialog("Enter a string delaminated by *");

	  phrase1 = phrase1.replace('*', ' ');
	   
	   JOptionPane.showMessageDialog(null, "" +phrase1, null, 0);
	    
	    
		
	}

    
    

}
