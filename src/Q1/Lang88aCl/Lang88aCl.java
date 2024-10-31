package Q1.Lang88aCl;
import java.util.Scanner;

public class Lang88aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1-13: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2-20: ");
        int num2 = input.nextInt();

        int max = 0;
        int sum = 0;
        int dif = 0;
        int pro = 0;
        int ave = 0;
        int abs = 0;
        int min = 0;
        Cl88a wow = new Cl88a(num1, num2, sum, dif, pro, ave, abs, max, min); // New object of "Cl52a" class
        wow.calc(); // Don't forget to call calc() or setThing()!
        sum = wow.getSum();
        dif = wow.getDif();
        pro = wow.getPro();
        ave = wow.getAve();
        abs = wow.getAbs();
        max = wow.getMax();
        min = wow.getMin();


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
Maximum = 20
Minimum = 13
Sum = 33
Difference = -7
Product = 260
Average = 16
Absolute Value = 7
 */
