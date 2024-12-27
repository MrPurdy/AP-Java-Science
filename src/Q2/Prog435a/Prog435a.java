package Q2.Prog435a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog435a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog435a.dat"));
            Cl435a[] list = new Cl435a[100];
            int counter = 0;

            while (file.hasNext()) {
                int cartype = file.nextInt();
                int toll = file.nextInt();

                if (cartype != -1) {
                    Cl435a c = new Cl435a(cartype, toll);
                    list[counter] = c;
                    counter++;
                }
            }
            for (int lcv = 0; lcv < counter; lcv++) {
                list[lcv].calc();
            }
            for (int lcv = 0; lcv < counter; lcv++) {
                System.out.println(list[lcv]);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

/*
Compact Car		$1.0		$1.35		$1.35
Small Car		$1.3		$2.5		$3.25
Medium Size Car	$1.6		$4.1		$6.56
Full Size Car	$2.0		$5.5		$11.0
Truck		    $2.4		$2.0		$4.8
16 Wheeler		$0.0		$3.25		$0.0
Compact Car		$1.0		$4.8		$4.8
Small Car		$1.3		$6.0		$7.800000000000001
Medium Size Car	$1.6		$1.35		$2.16
Full Size Car	$2.0		$2.5		$5.0
Truck		    $2.4		$4.1		$9.839999999999998
16 Wheeler		$0.0		$5.5		$0.0
Compact Car		$1.0		$6.0		$6.0
Small Car		$1.3		$1.35		$1.7550000000000001
Medium Size Car	$1.6		$2.0		$3.2
Full Size Car	$2.0		$2.5		$5.0
Truck		    $2.4		$3.25		$7.8
16 Wheeler		$0.0		$4.1		$0.0
 */