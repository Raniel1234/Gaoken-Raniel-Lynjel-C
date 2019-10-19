import java.util.Scanner;
public class Calc{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String output = "",perform;
		int num,num1,num2;
		System.out.print("Enter # of operations: ");
		num = scan.nextInt();
		if(num>=1&&num<=100){
      System.out.print("Enter all operations in one line: ");
      for(int i = 1;i<=num;i++){
        perform = scan.next().toLowerCase();
        switch(perform){
          case "negate":	
            num1 = scan.nextInt();
            output = output.concat("\n["+i+"] Operation: "+num1*-1);
            break;
          case "add":
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            output = output.concat("\n["+i+"] Operation: "+(num1+num2));
            break;
          case "max":
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            if(num1>=num2)
              num2 = num1;
            output = output.concat("\n["+i+"] Operation: "+num2);
            break;
          default:
            System.out.println("Invalid operation.");
            System.exit(0);
        }
      }
      System.out.println(output);
    }else
      System.out.println("Enter a number from 1 to 100 only.");
	}
}