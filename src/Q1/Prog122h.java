package Q1;
import java.util.Scanner;
import java.util.*;

public class Prog122h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1 = 0;
        double root = (1.00 / 4.00);

        while (num1 < 20) {
            num1 +=1;
            double num3 = Math.sqrt(num1);
            double num2 = Math.pow(num1, 2);
            double num4 = Math.pow(num1, 3);
            double num5 = Math.pow(num1, root);
            System.out.println(num1 + "\t\t" + num2 + "\t\t" + num3 + "\t\t" + num4 + "\t\t" + num5);
        }
    }
}

/*
1.0		1.0		1.0		1.0		1.0
2.0		4.0		1.4142	8.0		1.1892
3.0		9.0		1.732	27.0	1.3160
4.0		16.0	2.0		64.0	1.4142
5.0		25.0	2.2360	125.0	1.4953
6.0		36.0	2.4494	216.0	1.5650
7.0		49.0	2.6457	343.0	1.6265
8.0		64.0	2.8284	512.0	1.6817
9.0		81.0	3.0	    729.0	1.7320
10.0	100.0	3.1622	1000.0	1.7782
11.0	121.0	3.3166	1331.0	1.8211
12.0	144.0	3.4641	1728.0	1.8612
13.0	169.0	3.6055	2197.0	1.8988
14.0	196.0	3.7416	2744.0	1.9343
15.0	225.0	3.8729	3375.0	1.9679
16.0	256.0	4.0	    4096.0	2.0
17.0	289.0	4.1231	4913.0	2.0305
18.0	324.0	4.2426	5832.0	2.0597
19.0	361.0	4.3588	6859.0	2.0877
20.0	400.0	4.4721	8000.0	2.1147
 */
