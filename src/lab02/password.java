package lab02;

import javax.swing.JOptionPane;

public class password 
{
	public static void main(String[] args)
	{
	String attempedpw  = JOptionPane.showInputDialog("Please Enter the Password");
	String password ="Bulls";
	if(attempedpw.equals(password))
	{
		JOptionPane.showMessageDialog(null,"Access Granted");
	}
	else
	{
		JOptionPane.showMessageDialog(null, "Access Denied") ;
	}
	

}
}
