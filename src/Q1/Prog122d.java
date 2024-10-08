package Q1;

import java.util.Scanner;

public class Prog122d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x = -13;
        double y = Math.pow(x, 6) - 3 * Math.pow(x, 5) - 93 * Math.pow(x, 4) + 87 * Math.pow(x, 3) + 1596 * Math.pow(x, 2) - 1280 * x - 2800;
        while (x < 16) {

            x += 1;
            System.out.println(x);


        }
    }
}
