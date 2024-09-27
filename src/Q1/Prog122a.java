package Q1;

import java.util.Scanner;

public class Prog122a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double lcv = 0;
        while (lcv < 50) {
            lcv +=1;
            double lcv2 = Math.pow(lcv, 2);
            double lcv3 = Math.sqrt(lcv);

            System.out.print(lcv+ "\t\t" + lcv2 + "\t\t %.4f", lcv3);
        }
    }
}
