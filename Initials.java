import javax.swing.*;

public class Initials{
    public static void main(String [] args){
    
    String firstName = "";
    String middleName = "";
    String lastName = "";
    
    firstName = JOptionPane.showInputDialog("Enter your first name initial:");
    middleName = JOptionPane.showInputDialog("Enter your middle name initial:");
    lastName = JOptionPane.showInputDialog("Enter your last name initial:");
    JOptionPane.showMessageDialog(null,  firstName.charAt(0) + "." + middleName.charAt(0) + "."+ lastName.charAt(0)+ ".");
      
    } 
 }  