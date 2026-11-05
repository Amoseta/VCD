package lt.vcd;

import java.util.Scanner;

public class DoWhile {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int evenCount = 0;
        int oddCount = 0;
        int number;
        System.out.println("Enter integer numbers (enter 0 to stop):");
        do {
            number = input.nextInt();
            if (number != 0) {
                if (number % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

        } while (number != 0); // Sukamės, kol neįvestas 0

        // 4. Ciklas baigėsi, išvedame galutinius rezultatus
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);

        input.close();
    }
}