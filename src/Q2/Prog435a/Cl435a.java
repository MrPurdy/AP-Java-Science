package Q2.Prog435a;

public class Cl435a {
        private int myCar;
        private int myToll;
        private double myCost;
        private double[] tollnum = new double[8];
        private double[] carnum = new double[6];
        private String[] cartype = new String[7];



        public Cl435a(int Car, int Toll) {
                myCar = Car;
                myToll = Toll;
                myCost = 0.0;
                tollnum[0] = 1.35;
                tollnum[1] = 2.00;
                tollnum[2] = 2.50;
                tollnum[3] = 3.25;
                tollnum[4] = 4.10;
                tollnum[5] = 4.8;
                tollnum[6] = 5.50;
                tollnum[7] = 6.0;
                carnum[0] = 1.00;
                carnum[1] = 1.30;
                carnum[2] = 1.60;
                carnum[3] = 2.00;
                carnum[4] = 2.40;
                carnum[5] = 2.70;
                cartype[0] = "Compact Car";
                cartype[1] = "Small Car";
                cartype[2] = "Mis Size Car";
                cartype[3] = "Full Size Car";
                cartype[4] = "Truck";
                cartype[5] = "16 Wheeler";

        }

        public void calc() {
                myCost = tollnum[myToll - 1] * carnum[myCar - 1];
        }
}
