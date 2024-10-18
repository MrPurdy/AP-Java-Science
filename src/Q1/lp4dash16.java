package Q1;
import java.util.*;

import java.util.Scanner;

public class lp4dash16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an angle in degrees: ");
        int degree1 = input.nextInt();
        System.out.println("");

        double rad1 = Math.toRadians(degree1);
        double sin = Math.sin(rad1);

        double rad2 = Math.toRadians(degree1);
        double cos = Math.cos(rad2);

        double rad3 = Math.toRadians(degree1);
        double tan = Math.tan(rad3);

        System.out.printf("Sine: %.1f\n", sin);
        System.out.printf("Cosine: %.3f\n", cos);
        System.out.printf("Tangent: %.3f\n", tan);


    }
}
/*
Enter an angle in degrees: 30

Sine: 0.5
Cosine: 0.866
Tangent: 0.577
 */