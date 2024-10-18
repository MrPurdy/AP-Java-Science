package Q1;
import java.util.*;
import java.util.Scanner;

public class lp5dash9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1 = 0;

        while (num1 < 6) {
            num1 +=1;
            double num2 = Math.pow(num1, 2);
            double num3 = Math.pow(num1, 3);
            double num4 = Math.pow(num1, 4);
            double num5 = Math.pow(num1, 5);
            System.out.println(num1 + "\t\t" + num2 + "\t\t" + num3 + "\t\t" + num4 + "\t\t" + num5);
        }
    }
}

/*
1.0		1.0		1.0		1.0		1.0
2.0		4.0		8.0		16.0	32.0
3.0		9.0		27.0	81.0	243.0
4.0		16.0	64.0	256.0	1024.0
5.0		25.0	125.0	625.0	3125.0
6.0		36.0	216.0	1296.0	7776.0
 */