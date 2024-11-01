package Q1.Lang54cCl;


import java.util.Scanner;

public class Lang54cCl {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("The radius of the circle: ");
        double rad = input.nextDouble();

        double PI = Math.PI;
        double area = 0;
        double cir = 0;
        Cl54c wow = new Cl54c(PI, rad, area, cir); // New object of "Cl52a" class
        wow.calc(); // Don't forget to call calc() or setThing()!
        cir = wow.getCir();
        area = wow.getArea();

        System.out.printf("The Area of the circle: %.3f\n", area);
        System.out.printf("The Circumference of the circle: %.3f", cir);
    }
}


/*
The radius of the circle: 3.712
The Area of the circle: 43.288
The Circumference of the circle: 23.323
 */