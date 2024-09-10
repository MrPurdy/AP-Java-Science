package Q1;

import java.util.Scanner;

public class Prog54c {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter radius: ");

        double PI = 3.14159;

        double rad = keyboard.nextDouble();

        double area = PI * rad * rad;

        double cir = 2.0 * PI * rad;

        System.out.printf("The Area of the circle is = %.3f\n", area);

        System.out.printf("The Circumference of the circle is = %.3f\n", cir);

        System.out.print("The Radius of the circle is = " + rad);


    }
}

/*
The Area of the circle is = 43.288
The Circumference of the circle is = 23.323
The Radius of the circle is = 3.712
 */