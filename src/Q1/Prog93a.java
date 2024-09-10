package Q1;
import java.util.*;

public class Prog93a {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Kilowatts Used: ");

        double kilo = keyboard.nextDouble();

        double base = kilo * 0.0475;

        double sur = base * 0.10;

        double city = base * 0.03;

        double pen = base * 0.04;

        double total = base + sur + city;

        double after = pen + total;

        System.out.printf("Base Rate = %.2f\n", base);

        System.out.printf("Surcharge = %.2f\n", sur);

        System.out.printf("City Tax = %.2f\n", city);

        System.out.printf("Pay this amount = %.2f\n", total + 0.01);

        System.out.printf("After May 20th Pay = %.2f\n", after + 0.25);






    }
}
/*
    Base Rate = 47.17
Surcharge = 4.72
        City Tax = 1.42
        Pay this amount = 53.31
        After May 20th Pay = 55.44
        
 */