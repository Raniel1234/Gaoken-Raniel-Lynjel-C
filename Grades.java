import java.util.Scanner;

public class Grades{
    public static void main(String [] args){
        Scanner grades = new Scanner(System.in);

        int x = 0;

        System.out.print("What is the percentage of the student: ");
        x = grades.nextInt();

        if (x <= 92 && x >= 100)
             System.out.print("A");
        else if (x >= 87 && x <= 91)
             System.out.print("B+");
        else if (x >= 83 && x <= 86)
             System.out.print("B");
        else if (x >= 79 && x <= 82)
             System.out.print("C+");
        else if (x >= 75 && x <= 78)
             System.out.print("C");
        else if (x >= 70 && x <= 74)
             System.out.print("D");
        else if (x <70)
             System.out.print("F");
        // so on and so forth down the grading scale
    }
}
