package Q2.Prog214b;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog214b {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/Prog214b.dat"));
            Cl214b[] list = new Cl214b[100];
            int counter = 0;

            while (file.hasNext()) {
                int Enum = file.nextInt();
                double Years = file.nextDouble();
                double Rate = file.nextDouble();
                double Factor = file.nextDouble();
                double Hours = file.nextDouble();

                if(Enum != -1) {
                    Cl214b coolbeans = new Cl214b(Hours, Years, Rate, Factor, Enum);
                    list[counter] = coolbeans;
                    counter++;
                }
            }
            for(int lcv = 0; lcv < counter; lcv++) {
                list[lcv].calc();
            }
            for(int lcv = 0; lcv < counter; lcv++) {
                System.out.println(list[lcv]);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
/*
Employee Number: 1001
Hours: 34.5
Rate: 1056.1
Factor:  4.5
Current Yeat-to-date: 1.25
Gross Pay: 163959.525
Whith Holdings: 28692.916874999995
Fica: 9925.525637499999
Net Pay:  125341.0824875
Employee Number: 1002
Hours: 25.0
Rate: 3970.0
Factor:  3.25
Current Yeat-to-date: 1.0
Gross Pay: 322562.5
Whith Holdings: 56448.4375
Fica: 19521.02075
Net Pay:  246593.04175
Employee Number: 1003
Hours: 30.0
Rate: 12485.5
Factor:  4.0
Current Yeat-to-date: 1.0
Gross Pay: 1498260.0
Whith Holdings: 262195.5
Fica: 90650.71949999999
Net Pay:  1145413.7805
Employee Number: 1004
Hours: 38.5
Rate: 15587.4
Factor:  5.25
Current Yeat-to-date: 1.5
Gross Pay: 3150603.225
Whith Holdings: 551355.564375
Fica: 190617.4543625
Net Pay:  2408630.2062625
Employee Number: 1005
Hours: 40.0
Rate: 17188.5
Factor:  6.25
Current Yeat-to-date: 1.0
Gross Pay: 4297125.0
Whith Holdings: 751996.875
Fica: 259982.052
Net Pay:  3285146.073
Employee Number: 1006
Hours: 48.0
Rate: 19109.4
Factor:  8.95
Current Yeat-to-date: 1.5
Gross Pay: 8209398.24
Whith Holdings: 1436644.692
Fica: 496674.55277
Net Pay:  6276078.9952300005
Employee Number: 1007
Hours: 35.0
Rate: 15600.0
Factor:  5.0
Current Yeat-to-date: 1.5
Gross Pay: 2730000.0
Whith Holdings: 477749.99999999994
Fica: 165170.95924999999
Net Pay:  2087079.04075
 */