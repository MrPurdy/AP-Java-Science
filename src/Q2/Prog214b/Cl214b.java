package Q2.Prog214b;

public class Cl214b {
    private double myNum;
    private double myHours;
    private double myRate;
    private double myFactor;
    private double myGross;
    private double myFICA;
    private double myNet;
    private double myYears;
    private double myTax;
    private int myENum;


    public Cl214b(double Hours, double Rate, double Factor, double Years, int ENum) {
        myHours = Hours;
        myRate = Rate;
        myFactor = Factor;
        myYears = Years;
        myTax = 0;
        myGross = 0;
        myFICA = 0;
        myNum = 100;
        myNet = 0;
        myENum = ENum;
    }



    public void calc() {
        myGross = myHours * myRate * myFactor;
        if (myGross < 100) myTax = 0;
        else if (myGross < 150) myTax = myGross * 0.08;
        else if (myGross < 200) myTax = myGross * 0.12;
        else if (myGross < 300) myTax = myGross * 0.15;
        else myTax = myGross * 0.175;

        if (myYears > myNum) myFICA = 0;
        else if (myYears + myGross < myNum) myFICA = myGross * 0.0605;
        else myFICA = 0.0605 * (Math.abs(myNum - myYears + myGross));
        myNet = myGross - myTax - myFICA;
    }


    public String toString() {
        return  "Employee Number: " + myENum +
                "\nHours: " + myHours +
                "\nRate: " + myRate +
                "\nFactor:  " + myFactor
                + "\nCurrent Yeat-to-date: " + myYears +
                "\nGross Pay: " + myGross +
                "\nWhith Holdings: " + myTax +
                "\nFica: " + myFICA +
                "\nNet Pay:  " + myNet;
    }
}


