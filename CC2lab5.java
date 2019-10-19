
public class CC2lab5{
    public static void main (String []  args) {
    double messagecount = Math.random()*1000;
    double charge;
    if(messagecount-200<=0) charge = 0;
    else charge = (int)(messagecount- 200)*0.5;
    
    System.out.println("sent " +(int)messagecount + " message.");
    System.out.println("you have incured " + charge + " PHP in charges.");
     }
     }