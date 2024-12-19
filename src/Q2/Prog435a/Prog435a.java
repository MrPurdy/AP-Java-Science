package Q2.Prog435a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Prog435a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog435a.dat"));
            Cl435a[] list = new Cl435a[100];
            int count = 0;

            while (input.hasNext()) {
                int toll = input.nextInt();
                int car = input.nextInt();


                if(car != -7) {
                 Cl435a coolbeans = new Cl435a(car, toll);
                 list[count] = coolbeans;
                 count++;
             }

            }
            for (int lcv = 0; lcv < count; lcv++) {
                list[lcv].calc();
            }
            for (int lcv = 0; lcv < count; lcv++) {
                System.out.println(list[lcv]);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
