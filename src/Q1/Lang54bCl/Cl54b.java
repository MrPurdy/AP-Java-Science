package Q1.Lang54bCl;

public class Cl54b {
    private int myNum1;
    private int myNum2;
    private int myNum3;
    private int myNum4;
    private int mySum;
    private double myAve;

    public Cl54b(int num1, int num2, int num3, int num4, int sum, double ave) {
        myNum1 = num1;
        myNum2 = num2;
        myNum3 = num3;
        myNum4 = num4;
        mySum = sum;
        myAve = ave;
    }

    public void calc() {
        mySum = myNum1 + myNum2 + myNum3 + myNum4;
        myAve = mySum / 4.0;
    }

    public int getSum() {
        return mySum;
    }
    public double getAve() {
        return myAve;
    }
}
