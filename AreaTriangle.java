package lt.vcd;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Length of first side (a): ");
        double a = input.nextDouble();

        System.out.print("Length of second side (b): ");
        double b = input.nextDouble();

        System.out.print("Length of third side (c): ");
        double c = input.nextDouble();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {

            double p = (a + b + c) / 2;

            double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));

            System.out.printf("Area of Triangle s = %.2f%n", square);

        } else {
            System.out.println("Error: This triangle is not impossible!");
        }

        input.close();
    }
}

