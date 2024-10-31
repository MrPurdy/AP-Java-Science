package Q1.Prog76aCl;

import java.util.Scanner;

public class Prog76aCl {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number you dislike: ");
        int dis = input.nextInt();

        int sup = 0;
        Cl76a wow = new Cl76a(dis, sup); // New object of "Cl52a" class
        wow.calc(); // Don't forget to call calc() or setThing()!
        sup = wow.getSup();

        System.out.println(sup);
    }
}


/*
Enter a number you dislike: 4
444444444
 */