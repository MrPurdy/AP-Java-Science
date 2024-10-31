package Q1.Lang54cCl;

public class Cl54c {
    private double myPI;
    private double myRad;
    private double myArea;
    private double myCir;

    public Cl54c(double PI, double rad, double area, double cir) {
        myPI = PI;
        myRad = rad;
        myArea = area;
        myCir = cir;
    }

    public void calc() {
         myArea = myPI * myRad * myRad;
         myCir = 2.0 * myPI * myRad;
    }
}
