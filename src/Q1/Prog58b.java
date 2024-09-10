package Q1;
import java.util.*;
import java.util.Scanner;

public class Prog58b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter A: ");
        double a = input.nextDouble();
        System.out.println();

        System.out.print("Enter B: ");
        double b = input.nextDouble();
        System.out.println();

        System.out.print("Enter C: ");
        double c = input.nextDouble();
        System.out.println();

        double pos = (-b + Math.sqrt(Math.pow(b, 2) -4 * a * c)/(2 * a));
        
        double neg = (-b - Math.sqrt(Math.pow(b, 2) -4 * a * c)/(2 * a));

        System.out.printf("The Roots are: " + pos + neg);

    }
    
}
