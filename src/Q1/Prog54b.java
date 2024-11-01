package Q1;

import java.util.Scanner;

public class Prog54b {
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

        int sum = num1 + num2 + num3 + num4;
        System.out.print("The sum of the four numbers is  " + "" + sum);


        double ave = sum / (double)4;
        System.out.print("The average of the four numbers is " + ave);



    }
}

    /* Enter first 3-digit number: 475
        Enter second 3-digit number: 821
        Enter third 3-digit number: 369
        Enter fourth 3-digit number: 562
        The sum of the four numbers is  2227
        The average of the four numbers is 556.75
     */