package lt.vcd;

import java.util.Scanner;

public class PirminiaiSkaiciai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Įveskite sveikąjį skaičių N (bent 2): ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Klaida: skaičius turi būti bent 2.");
        } else {
            atspausdintiPirminius(n);
        }

        scanner.close();
    }

    public static void atspausdintiPirminius(int n) {
        for (int i = 2; i <= n; i++) {
            if (arPirminis(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Nukeliame eilutę pabaigoje
    }

    /**
     * Pagalbinė funkcija, kuri patikrina, ar skaičius yra pirminis.
     */
    public static boolean arPirminis(int skaicius) {
        // Tikriname daliklius nuo 2 iki skaičiaus kvadratinės šaknies (optimizacija)
        for (int i = 2; i * i <= skaicius; i++) {
            if (skaicius % i == 0) {
                return false; // Jei dalijasi, skaičius nėra pirminis
            }
        }
        return true; // Jei nerasta jokių daliklių, skaičius yra pirminis
    }
}

