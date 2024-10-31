package Q1.Lang82aCl;

import java.util.Scanner;

public class Lang82aCl {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the speed limit: ");
        int spe = input.nextInt();
        System.out.print("Enter vehicle speed: ");
        int lim = input.nextInt();

        int fine = 0;
        Cl82a wow = new Cl82a(spe, lim, fine); // New object of "Cl52a" class
        wow.calc(); // Don't forget to call calc() or setThing()!
        fine = wow.getFine();

        System.out.println("Fine--------$" + fine);
    }
}

/*
Enter the speed limit: 30
Enter vehicle speed: 42
Fine--------$80
 */
