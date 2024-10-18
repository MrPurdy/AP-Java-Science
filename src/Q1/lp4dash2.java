package Q1;
import java.util.*;
public class lp4dash2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Package weight in kilograms: ");
        int kilo = input.nextInt();
        System.out.println("");

        System.out.print("Enter Package length in centimeters: ");
        int len = input.nextInt();
        System.out.println("");

        System.out.print("Enter Package width in centimeters: ");
        int wid = input.nextInt();
        System.out.println("");

        System.out.print("Enter Package height in centimeters: ");
        int hei = input.nextInt();
        System.out.println("");

        if (kilo >= 27) {
            System.out.println("Too heavy");
        } else if (len * wid * hei >= 100000) {
            System.out.println("Too large");
        } else if (kilo >= 27 && len * wid * hei >= 100000) {
            System.out.println("Too heavy and too large");
        }





    }
}

/*
Enter Package weight in kilograms: 28

Enter Package length in centimeters: 10

Enter Package width in centimeters: 10

Enter Package height in centimeters: 10

Too heavy
 */