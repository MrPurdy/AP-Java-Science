package Q1;
import java.util.*;
import java.util.Scanner;

public class lp4dash1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of copies to be printed: ");
        int copies = input.nextInt();
        double cost = 0;
        System.out.println("");


        if (copies > 0 && copies <= 99) {
            cost = 0.30;
        } else if (copies >= 100 && copies <= 499) {
           cost = 0.28;
        } else if (copies >= 500 && copies <= 749) {
            cost = 0.27;
        } else if (copies >= 750 && copies <= 1000){
            cost = 0.26;
        } else if (copies >= 1000 && copies <= 1000000000) {
            cost = 0.25;
        }

        double total = copies * cost;
        System.out.println("Price per copy is: " + cost);
        System.out.println("Total Cost: " + total);


    }
}
/*
Enter number of copies to be printed: 1001

Price per copy is: 0.25
Total Cost: 250.25
 */
