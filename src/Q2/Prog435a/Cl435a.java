package Q2.Prog435a;

public class Cl435a {
    private int myCarType;
    private int myToll;
    private double myCost;
    private double[] tollnum = new double[8];
    private double[] carnum = new double[6];
    private String[] car = new String[6];



    public Cl435a(int cartype, int toll) {
        myCarType = cartype;
        myToll = toll;
        myCost = 0;
        tollnum[0] = 1.35;
        tollnum[1] = 2;
        tollnum[2] = 2.5;
        tollnum[3] = 3.25;
        tollnum[4] = 4.1;
        tollnum[5] = 4.8;
        tollnum[6] = 5.5;
        tollnum[7] = 6;
        carnum[0] = 1;
        carnum[1] = 1.3;
        carnum[2] = 1.6;
        carnum[3] = 2;
        carnum[4] = 2.4;
        car[0] = "Compact Car";
        car[1] = "Small Car";
        car[2] = "Medium Size Car";
        car[3] = "Full Size Car";
        car[4] = "Truck";
        car[5] = "16 Wheeler";
    }

    public void calc() {
        myCost = tollnum[myToll - 1] * carnum[myCarType - 1];
    }

public String toString() {
        return car[myCarType - 1]
                + "\t\t$" + carnum[myCarType - 1]
                + "\t\t$" + tollnum[myToll - 1]
                + "\t\t$" + myCost;
}
}
