package Q1;

import java.util.Scanner;

public class Prog122c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1 = 0;
        double num2 = 1;
        double num3 = 0;

        while (num1 < 10) {
            num1 +=2;
            num2 +=2;
            num3 +=4;
            double num4 = Math.pow(num1, 2);

            System.out.println(num1 + "\t\t" + num2 + "\t\t" + num3 + "\t\t" + num4);
        }
    }
}

/*
2.0		3.0		4.0		4.0
4.0		5.0		8.0		16.0
6.0		7.0		12.0	36.0
8.0		9.0		16.0	64.0
10.0	11.0    20.0	100.0
 */