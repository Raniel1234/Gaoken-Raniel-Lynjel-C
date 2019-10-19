public class VariablesAndDataType{
  public static void main(String [] args){
    String temp = "The Temperature in Baguio City has warmed throughout the years";
    char a = 'A';
    float degrees = 16.0f;
    double degrees1 = 23.5;
    
    byte hours =  24;
    short days = 7; 
    int  weeks = 4;
    long months = 12;
    
    boolean warmed = true;
    
    if(warmed == true ){
    System.out.println(temp + " \n");
    System.out.print("\t" +a + " recent news article stated that the city has been avaraging " + degrees+ "degrees celsius at dawn and " +degrees1+"at noon. \n");
  
    System.out.print("\t \t Regardless, lowlanders still feel cold "+hours+" a day, " +weeks+ "weeks per month and" +months+"months each year. \n");
    
    }else{
    
    System.out.println ("The boolean was changed to a false");
    }
 
 
 
 
 
    }
 }
  