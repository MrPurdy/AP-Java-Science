package Q1;

import java.util.Scanner;

public class Prog58t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Purchase Price:");
        double p = input.nextDouble(); // Price\
        System.out.println();

        System.out.print("Enter Amount Received:");
        double r = input.nextDouble(); // Received
        System.out.println();

        double c = r - p;
        System.out.printf("Change Due $%.2f\n", c); // Due
        System.out.println();

        double d = Math.floor(c);
        double q = 0.25;
        double di = 0.10;
        double n = 0.05;
        double pe = 0.01;

        System.out.printf("Dollars: " + d);

        double df = Math.floor(c / q);
        System.out.printf("\n Quarters: \n" + df);




    }
}
