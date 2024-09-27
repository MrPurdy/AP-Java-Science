package Q1;

import java.util.Scanner;

public class Prog72t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first time: ");
        double time1 = input.nextDouble();

        System.out.print("Enter the second time: ");
        double time2 = input.nextDouble();

        double ftime = time2 - time1;

        System.out.print(ftime);

    }
}
/*
Enter the first time: 900
Enter the second time: 1730
830
 */