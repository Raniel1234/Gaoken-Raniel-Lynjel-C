import java.io.*;
import java.text.DecimalFormat;
public class Room{

public static void main(String [] args){

BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
String input = "";
double length = 0;
double width =0;
DecimalFormat decimal = new DecimalFormat("0.00");

try{
  System.out.println("Enter Length:");
  input = reader.readLine();
  length = Double.parseDouble(input);
  System.out.println("Enter width:");
  input = reader.readLine();
  width = Double.parseDouble(input);

}
catch(IOException e){
    System.out.println("error");

}
System.out.println("The floor space of the room is "+ (decimal.format (length*width)) +" square units.");

}
}
