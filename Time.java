import java.util.*;

public class Time{

  public static void main(String[]args ){
  
    Scanner sc = new Scanner (System.in);
    int minutes = 0;
    
    System.out.print("Enter number of minutes:");
    minutes = sc.nextInt();
    System.out.println(minutes + " minutes is " + (minutes/60) + "hours and " +(minutes&60) + " minutes.") ;
          
          
          
          }
    }