package Q1;

import java.util.Scanner;

public class lp4dash6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();

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
        System.out.println(rnum1 + "\t" + rnum2);
    }
}
