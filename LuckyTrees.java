import javax.swing.*;
public class 6numbers{
  public static void main (String [] args){
  int branches;
  
  do{String in = JOptionPane.showInputDialog("Input 6 Number: ");
      branches = Integer.parseInt(in);
    if(branches==0){
      System.out.println(branches + " -End-");
    }
    else if(branches/10<1){
      System.out.println(branches + "  Normal");
    }
    else if(branches %7==0 && branches %3==0){
      System.out.println(branches + " Lucky");
    }
    else{
      System.out.println(branches + " Normal");
    }
  } while(branches!=0);
  
  }
}
