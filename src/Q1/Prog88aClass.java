package Q1;

import java.util.Scanner;

public class Prog88aClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number 1-13 : ");
        double num1 = input.nextInt();
        System.out.println("Enter a number 2-20: ");
        double num2 = input.nextInt();

        double sum = num1 + num2;
        double dif = num1 - num2;
        double pro = num1 * num2;
        double ave = (num1 + num2) / 2;
        double abs = Math.abs(dif);
        double max = Math.abs(num1 - num2) + num1;
        double min = Math.abs(num1 + num2) - num2;

        System.out.println("Original numbers are " + num1 + " and " + num2);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + dif);
        System.out.println("Product = " + pro);
        System.out.println("Average = " + ave);
        System.out.println("Absolute Value = " + abs);


    }
}

/*
Maximum = 20.0
Minimum = 13.0
Sum = 33.0
Difference = -7.0
Product = 260.0
Average = 16.5
Absolute Value = 7.0
 */