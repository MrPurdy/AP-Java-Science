package Q1;
import java.util.Scanner;

public class Prog58h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Amount Saved: ");
        double p = input.nextDouble();
        System.out.println();


        System.out.print("Interest Rate?: ");
        double r = input.nextDouble();
        System.out.println();


        System.out.print("Number of times compounded per year: ");
        double n = input.nextDouble();
        System.out.println();


        System.out.print("Number of days at interest?: ");
        double t = input.nextDouble();
        System.out.println();

        double exponent = (n*t) / 365;

        double a = p *(1+(Math.pow((0.01*r/n), exponent)));

        System.out.printf("Test %.2f\n", a);
        // System.out.printf("The total amount in savings is now %.2f\n", );

    }
}
