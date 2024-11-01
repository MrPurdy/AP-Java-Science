package Q1.Lang54bCl;

import Q1.Lang54cCl.Cl54c;

import java.util.Scanner;

public class Lang54b {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter first 3-digit number: ");
        int num1 = keyboard.nextInt();
        System.out.print("Enter second 3-digit number: ");
        int num2 = keyboard.nextInt();
        System.out.print("Enter third 3-digit number: ");
        int num3 = keyboard.nextInt();
        System.out.print("Enter fourth 3-digit number: ");
        int num4 = keyboard.nextInt();

        int sum = 0;
        double ave = 0;
        Cl54b wow = new Cl54b(num1, num2, num3, num4, sum, ave); // New object of "Cl52a" class
        wow.calc(); // Don't forget to call calc() or setThing()!
        sum = wow.getSum();
        ave = wow.getAve();

        System.out.println("The sum of the four numbers is : \n" + sum);
        System.out.printf("The average of the four numbers is : %.2f", ave);
    }
}

/*
Enter first 3-digit number: 475
Enter second 3-digit number: 821
Enter third 3-digit number: 369
Enter fourth 3-digit number: 562
The sum of the four numbers is :
2227
The average of the four numbers is : 556.75
 */

