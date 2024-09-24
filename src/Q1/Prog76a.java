package Q1;

import java.util.Scanner;

public class Prog76a {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number you dislike: ");
        int num = input.nextInt();

        int step1 = num * 9;

        int step2 = step1 * 12345679;

        System.out.println(step2);


    }
}

/*
Enter a number you dislike: 5
555555555
 */