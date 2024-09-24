package Q1;

import java.util.Scanner;

public class Prog65h {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Pounds: ");
        double po = input.nextDouble();

        System.out.print("Enter Shillings: ");
        double sh = input.nextDouble();

        System.out.print("Enter Pence: ");
        double pe = input.nextDouble();

        double decp = po + sh/20 + pe/12/20;

        System.out.printf("Decimal pounds $%.2f\n", decp);


    }
}


/*
Enter Pounds: 7
Enter Shillings: 17
Enter Pence: 9
Decimal pounds $7.89
 */