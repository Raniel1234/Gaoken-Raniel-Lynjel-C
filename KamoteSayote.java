import java.util.Scanner;
public class KamoteSayote{
  public static void main (String [] args){
    Scanner sc =new Scanner (System.in);
    int gKamote, mBahay, kSayote,rmndr;
    System.out.println("Enter Input: ");
    gKamote = sc.nextInt();
    mBahay = sc.nextInt();
    kSayote = sc.nextInt();
    
    if (mBahay <= gKamote && gKamote >= 1 && kSayote <= 1000 && mBahay <= 1000 && gKamote <=1000){
    int x = gKamote/mBahay;
    rmndr = gKamote%mBahay;
    int y = rmndr*kSayote;
    
    System.out.println(x +" kamote");
    System.out.println(y +" sayote");
    
    
    }else {
    System.out.println("Invalid input");
    
    
    }
 }
 }