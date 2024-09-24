package Q1;
import java.util.*;
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
        System.out.printf("Change Due $ %.2f\n", c); // Due
        System.out.println();

        double d = Math.floor(c);
        double q = (c - d - 0.25) / 0.25;
        double di = (c - d - 0.25 - 0.10 - 0.10 - 0.10) / 0.10;
        double n = (c - d - 0.25 - 0.10 - 0.10 - 0.10 - 0.05 - 0.05) / 0.05;
        double pe = (c - d - 0.25 - 0.10 - 0.10 - 0.10 - 0.05 - 0.05) / 0.01;

        System.out.printf("Dollars: \n" + d);

        System.out.printf("\nQuarters: %.0f",  q);

        System.out.printf("\nDimes: %.0f",  di);

        System.out.printf("\nNickles: %.0f",  n);

        System.out.printf("\nPennies: %.0f",  pe);




    }
}
/*
Dollars:
14.0
Quarters: 2
Dimes: 1
Nickles: 1
Pennies: 3
 */