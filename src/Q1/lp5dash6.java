package Q1;
import java.util.*;
import java.util.Scanner;

public class lp5dash6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");

        int num1 = input.nextInt();
        int sum = 0;

        while (num1 > 0) {
            sum += num1 % 10;
            num1 /= 10;

            }
        System.out.println(sum);
        }
    }

/*
Enter a positive integer:
892
19
 */