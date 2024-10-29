package Q1;

import java.util.Scanner;

public class lp5dash14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1a = (int) (Math.random() * (7 - 1)) + 1;
        int num2a = (int) (Math.random() * (7 - 1)) + 1;
        int num3a = num1a + num2a;
        int num1b = (int) (Math.random() * (7 - 1)) + 1;
        int num2b = (int) (Math.random() * (7 - 1)) + 1;
        int num3b = num1b + num2b;
        int num1c = (int) (Math.random() * (7 - 1)) + 1;
        int num2c = (int) (Math.random() * (7 - 1)) + 1;
        int num3c = num1c + num2c;
        int num1d = (int) (Math.random() * (7 - 1)) + 1;
        int num2d = (int) (Math.random() * (7 - 1)) + 1;
        int num3d = num1d + num2d;
        int num1e = (int) (Math.random() * (7 - 1)) + 1;
        int num2e = (int) (Math.random() * (7 - 1)) + 1;
        int num3e = num1e + num2e;



            System.out.println(num1a + "\t\t" + num2a + "\t\t" + num3a);
            System.out.println(num1b + "\t\t" + num2b + "\t\t" + num3b);
            System.out.println(num1c + "\t\t" + num2c + "\t\t" + num3c);
            System.out.println(num1d + "\t\t" + num2d + "\t\t" + num3d);
            System.out.println(num1e + "\t\t" + num2e + "\t\t" + num3e);
        }
    }
/*
5		1		6
2		1		3
5		3		8
5		6		11
4		2		6
 */