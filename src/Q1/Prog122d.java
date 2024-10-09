package Q1;

import java.util.Scanner;

public class Prog122d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x = -13;
        while (x < 16) {

            x += 1;
            double y = Math.pow(x, 6) - 3 * Math.pow(x, 5) - 93 * Math.pow(x, 4) + 87 * Math.pow(x, 3) + 1596 * Math.pow(x, 2) - 1280 * x - 2800;
            System.out.println(x + "\t\t" + y);


        }
    }
}
/*
-12.0		1896080.0
-11.0		981700.0
-10.0		452600.0
-9.0		172988.0
-8.0		44560.0
-7.0		-700.0
-6.0		-7000.0
-5.0		-500.0
-4.0		5648.0
-3.0		6980.0
-2.0		4120.0
-1.0		-100.0
0.0		-2800.0
1.0		-2492.0
2.0		200.0
3.0		2540.0
4.0		400.0
5.0		-10300.0
6.0		-31432.0
7.0		-59780.0
8.0		-83440.0
9.0		-77500.0
10.0		1000.0
11.0		218828.0
12.0		673040.0
13.0		1498180.0
14.0		2874200.0
15.0		5035100.0
16.0		8278288.0
 */