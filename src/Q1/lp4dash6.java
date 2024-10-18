package Q1;

import java.util.Scanner;

public class lp4dash6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = 0;
        int max = 10;
        int range = max - min + 1;
        int rnum1 = 0;
        int rnum2 = 0;
        for (int i = 0; i < 10; i ++) {
            rnum1 = (int)(Math.random() * range) + min;
        }
        for (int i = 0; i < 10; i ++) {
            rnum2 = (int)(Math.random() * range) + min;
        }
        int min2 = 1;
        int max2 = 4;
        int operator = 0;
        for (int i = 1; i < 4; i ++) {
            operator = (int)(Math.random() * range) + min;
        }
        if (operator == 1) {
            System.out.print("+");
        } else if (operator == 2) {
            System.out.print("-");
        } else if (operator == 3) {
            System.out.print("*");
        } else if (operator == 4) {
            System.out.print("/");
        }
        System.out.println("What is " + rnum1 + "\t" + operator  + "\t" + rnum2 );
    }
}

