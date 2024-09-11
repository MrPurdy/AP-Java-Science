package Q1;

public class Prog88a {
    public static void main(String[] args) {
        // Enter number 1-13
        // Enter number 2-20
        // Math.random() * (maz - min) + min
        int num1 = (int) (Math.random() * (13 - 1)) + 1;
        int num2 = (int) (Math.random() * (20 - 2)) + 2;
        int sum = num1 + num2;
        int dif = num1 - num2;
        int pro = num1 * num2;
        int ave = (num1 + num2) / 2;
        int abs = Math.abs(dif);
        int max, min;

        // The come inside 'if' will only run if the condition is true
        if (num1 > num2) {
            max = num1;
            // min = num2;
        } else { // Otherwise
            max = num2;
            // min = num1;
        }

        // Check if 'max' and 'num1' are the same value using ==
        if (max == num1) {
            min = num2;
        } else {
                min = num1;
            }
        System.out.println("Original numbers are " + num1 + " and " + num2);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + dif);
        System.out.println("Product = " + pro);
        System.out.println("Average = " + ave);
        System.out.println("Absolute Value = " + abs);


        }
    }
/*
Original numbers are 11 and 16
Maximum = 16
Minimum = 11
Sum = 27
Difference = -5
Product = 176
Average = 13
Absolute Value = 5
 */