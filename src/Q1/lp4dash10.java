package Q1;
import java.util.*;

import java.util.Scanner;

public class lp4dash10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length: ");
        int length = input.nextInt();
        System.out.println("");
        System.out.print("Enter the width: ");
        int width = input.nextInt();
        System.out.println("");
        System.out.print("Enter the height: ");
        int height = input.nextInt();
        System.out.println("");
        int volume = length * width * height;
        System.out.println("The volume is: " + volume);

        System.out.print("Enter the radius: ");
        int radius = input.nextInt();
        System.out.println("");
        int dia = radius * 2;
        double dia3 = Math.pow(dia, 3);
        double volume2 = (Math.PI * dia3) / 6;
        System.out.printf("The volume is: %.3f \n", + volume2);

        System.out.print("Enter the length of each side: ");
        int length2 = input.nextInt();
        System.out.println("");
        double volume3 = Math.pow(length2, 3);
        System.out.println("The volume is:" + volume3);
    }
}


/*
Enter the length: 3

Enter the width: 4

Enter the height: 5

The volume is: 60
Enter the radius: 3

The volume is: 113.097
Enter the length of each side: 4

The volume is:64.0
 */
