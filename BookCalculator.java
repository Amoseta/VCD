package lt.vcd;

import java.util.Scanner;

public class BookCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Average amount of books read by one visitor per month (v): ");
        int v = input.nextInt();

        System.out.print("Average amount of visitors per year (n): ");
        int n = input.nextInt();

        int k = v * 12;

        System.out.print("One visitor reads an average amount of books per year (k): " + k);

        input.close();
    }
}
