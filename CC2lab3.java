public class CC2lab3{
  public static void main(String []args){
    char a ='A';
    int asciiA = a;
    char n = 'n';
    int asciiB= n;
    char g ='G';
    int asciiC = g;
    char e ='E';
    int asciiD = e;
    char l ='L';
    int asciiE = l;
    char ee = '!';
    int asciiF = ee;
    
    int sum = asciiA + asciiB + asciiC + asciiD + asciiE + asciiF;
    long prod = asciiA * asciiB * asciiC * asciiD * asciiE * asciiF;
    int avg = sum  /6;
    int randr = (int)prod%avg;
    
    System.out.println(a + "-" + asciiA);
    System.out.println(n + "-" + asciiB);
    System.out.println(g + "-" + asciiC);
    System.out.println(e + "-" + asciiD);
    System.out.println(l + "_" + asciiE);
    System.out.println(ee + "-" + asciiF);
    
    System.out.println("" + a + n + + g +e + l + ee + ""); 
    
    System.out.println("sum: "+ sum);
     System.out.println("Product: " + prod);
       System.out.println("Average:" + avg);
     System.out.println("Remainder: " + randr);
     
          }
      }
      
    
    