package Q1;

import java.util.Scanner;

public class Prog54c {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter radius: ");

        double PI = 3.14159;

        int rad = keyboard.nextInt();

        double area = PI * rad * rad;

        double cir = 2 * PI * rad;

        System.out.printf("The Area of the circle is = %.3f\n", area);

        System.out.printf("The Circumference of the circle is = %.3f\n", cir);

        System.out.print("The Radius of the circle is = " + rad);


    }
}