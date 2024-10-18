package Q1;

import java.util.Scanner;

public class lp4dash3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of eggs purchased: ");
        int eggs = input.nextInt();
        double cost = 0;
        System.out.println("");


        if (eggs > 0 && eggs <= 3) {
            cost = 0.50;
        } else if (eggs >= 4 && eggs <= 5) {
            cost = 0.45;
        } else if (eggs >= 6 && eggs <= 10) {
            cost = 0.40;
        } else if (eggs >= 11 && eggs <= 1000000000){
            cost = 0.35;
        }

        double total = eggs * cost;
        System.out.println("The bill is equal to: " + total);
    }
}


/*
Enter the number of eggs purchased: 18

The bill is equal to: 0.7

 */
