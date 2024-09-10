package Q1;

import java.util.Scanner;

public class Prog58t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Purchase Price:");
        double p = input.nextDouble(); // Price

        System.out.print("Enter Purchase Price:");
        double r = input.nextDouble(); // Received

        double c = r - p;
        System.out.printf("Change Due $%.2f\n",c);




    }
}
