package Q1;

import java.util.Scanner;

public class Prog82a {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the speed limit: ");
        double sl = input.nextDouble();

        System.out.print("Enter vehicle speed: ");
        double vs = input.nextDouble();

        double fine = 20 + ((vs - sl) * 5);

        System.out.printf("Fine--------%.2f\n", fine);
    }
}
/*
Enter the speed limit: 30
Enter vehicle speed: 42
Fine--------80.00
 */