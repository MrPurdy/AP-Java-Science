package Q1;

import java.util.Scanner;

public class lp5dash17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pass = "cool555";
        System.out.print("Enter the password: ");
        String ans1 = input.next();


        if (pass.equals(ans1)) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
            System.out.print("Enter the password: ");
            String ans2 = input.next();
            if (pass.equals(ans2)) {
                System.out.println("Correct");
            } else {
                System.out.println("Incorrect");
                System.out.print("Enter the password: ");
                String ans3 = input.next();
                if (pass.equals(ans3)) {
                    System.out.println("Correct");
                } else {
                    System.out.println("Access Denied");
                }
            }
        }
    }
}
/*
Enter the password: 120
Incorrect
Enter the password: cool432
Incorrect
Enter the password: coolbeans
Access Denied
 */