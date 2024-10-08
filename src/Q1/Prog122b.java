package Q1;

import java.util.Scanner;

public class Prog122b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double hour = 0;
        double pay = 0;
        while (hour < 40) {
            hour +=1;
            pay +=4;
            System.out.println(hour + "\t\t" + pay);
        }
    }
}

/*
1.0		4.0
2.0		8.0
3.0		12.0
4.0		16.0
5.0		20.0
6.0		24.0
7.0		28.0
8.0		32.0
9.0		36.0
10.0		40.0
11.0		44.0
12.0		48.0
13.0		52.0
14.0		56.0
15.0		60.0
16.0		64.0
17.0		68.0
18.0		72.0
19.0		76.0
20.0		80.0
21.0		84.0
22.0		88.0
23.0		92.0
24.0		96.0
25.0		100.0
26.0		104.0
27.0		108.0
28.0		112.0
29.0		116.0
30.0		120.0
31.0		124.0
32.0		128.0
33.0		132.0
34.0		136.0
35.0		140.0
36.0		144.0
37.0		148.0
38.0		152.0
39.0		156.0
40.0		160.0
 */
