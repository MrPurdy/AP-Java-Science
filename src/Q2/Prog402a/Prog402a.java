package Q2.Prog402a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog402a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/Prog402a.dat"));
            Cl402a[] list = new Cl402a[100];
            int counter = 0;
            double mean = 0;

            double ble = 0;
            int[] bleh = new int[100];

            while (file.hasNext()) {
                int ID = file.nextInt();
                int score = file.nextInt();

                if(ID != -1) {
                    Cl402a obj = new Cl402a(ID, score);
                    list[counter] = obj;
                    bleh[counter] = score;
                    counter++;
                }
                ble += score;
                mean = ble / counter;


            }

            System.out.println("ID\t\tScore\t\tDiff");
            for (int lcv = 0; lcv < counter; lcv++) {
                double diff = Math.round((bleh[lcv] - mean)*100.0)/100.0;
                System.out.println(list[lcv] + "\t\t" + diff);
            }
            System.out.println("Mean: " + mean);

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
