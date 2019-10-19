import java.util.Scanner;
public class Triangle{
  public static void main (String [] args){
  Scanner sc = new Scanner(System.in);
    System.out.print("Enter Triangle Hieght:");
  int tri = sc.nextInt(); 
  for(int l=1;l<=tri;l++){
    if(1!=tri){
      System.out.print("1");
  for(int n=2;n<=l;n++){
    System.out.print("_" + n);
  }
    System.out.print("\n");
    }else{
    System.out.print("1");
  for(int n=2;n<1;n++){
    System.out.print("_" + n);
  }
    }
  }
  }
} 