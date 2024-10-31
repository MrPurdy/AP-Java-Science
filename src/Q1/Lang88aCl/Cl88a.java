package Q1.Lang88aCl;

public class Cl88a {
    private int myNum1;
    private int myNum2;
    private int mySum;
    private int myDif;
    private int myPro;
    private int myAve;
    private int myAbs;
    private int myMax;
    private int myMin;

    public Cl88a(int num1, int num2,int sum, int dif, int pro, int ave, int abs, int max, int min ) {
        myNum1 = num1;
        myNum2 = num2;
        mySum = sum;
        myDif = dif;
        myPro = pro;
        myAve = ave;
        myAbs = abs;
        myMax = max;
        myMin = min;
    }

    public void calc() {
        mySum = myNum1 + myNum2;
        myDif = myNum1 - myNum2;
        myPro = myNum1 * myNum2;
        myAve = (myNum1 + myNum2) / 2;
        myAbs = Math.abs(myDif);
        myMax = Math.abs(myNum1 - myNum2) + myNum1;
        myMin = Math.abs(myNum1 + myNum2) - myNum2;
    }

    public int getSum() {
        return mySum;
    }

    public int getDif() {
        return myDif;
    }
    public int getPro() {
        return myPro;
    }

    public int getAve() {
        return myAve;
    }
    public int getAbs() {
        return myAbs;
    }

    public int getMax() {
        return myMax;
    }
    public int getMin() {
        return myMin;
    }

}


