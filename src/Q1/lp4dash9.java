package Q1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class lp4dash9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number 1-20: ");
        int num1 = input.nextInt();
        System.out.println("Players Number: " + num1);

        int min = 0;
        int max = 20;
        int range = max - min + 1;
        int snum = 0;
        for (int i = 0; i < 20; i ++) {
            snum = (int)(Math.random() * range) + min;
        }
        if (num1 == snum) {
            System.out.println("You Won!");
        } else {
            System.out.println("Better luck next time.");

            }
        System.out.println("Computers Number: " + snum);
        }
    }
/*
Enter a number 1-20:
15
Players Number: 15
You Won!
Computers Number: 15
 */