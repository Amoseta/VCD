package lt.vcd;

import java.util.Scanner;

public class LyginiaiSkaiciai {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Įveskite teigiamą sveikąjį skaičių N: ");
        int n = scanner.nextInt();

        // Iškviečiame funkciją, kuri atliks visą darbą
        rastiIrSkaiciuotiLyginius(n);

        scanner.close();
    }

    public static void rastiIrSkaiciuotiLyginius(int n) {
        int kiekis = 0;

        System.out.println("Lyginiai skaiciai:");

        // Ciklas eina per visus skaičius nuo 1 iki N
        for (int i = 1; i <= n; i++) {
            // Patikriname, ar skaičius dalijasi iš 2 be liekanos
            if (i % 2 == 0) {
                System.out.print(i + " ");
                kiekis++; // Padidiname skaitiklį
            }
        }
        // Perkelia eilutę po skaičių išvedimo
        System.out.println();
        IO.println("Count: " + kiekis);
    }
}
