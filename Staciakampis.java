package lt.vcd;

import java.util.Scanner;

public class Staciakampis {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Įveskite aukštį (bent 2): ");
        int aukstis = scanner.nextInt();

        System.out.print("Įveskite plotį (bent 2): ");
        int plotis = scanner.nextInt();

        // Patikriname, ar įvesti teisingi duomenys
        if (aukstis < 2 || plotis < 2) {
            System.out.println("Klaida: aukštis ir plotis turi būti bent 2.");
        } else {
            nupiestiStaciakampi(aukstis, plotis);
        }

        scanner.close();
    }

    public static void nupiestiStaciakampi(int aukstis, int plotis) {
        // Einame per kiekvieną eilutę (aukštis)
        for (int i = 1; i <= aukstis; i++) {
            // Einame per kiekvieną stulpelį (plotis)
            for (int j = 1; j <= plotis; j++) {
                // Žvaigždutę spausdiname tik jei tai yra pirma/paskutinė eilutė arba pirmas/paskutinis stulpelis
                if (i == 1 || i == aukstis || j == 1 || j == plotis) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Vidų užpildome tarpais
                }
            }
            // Baigę eilutę, pereiname į kitą eilutę
            System.out.println();
        }
    }
}
