package lt.vcd;

import java.util.Scanner;

public class Faktorialas {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Įveskite sveikąjį skaičių N (nuo 0 iki 12): ");
        int n = scanner.nextInt();

        // Patikriname, ar skaičius patenka į rėžius [0, 12]
        if (n < 0 || n > 12) {
            System.out.println("Klaida: skaičius turi būti tarp 0 ir 12 imtinai.");
        } else {
            // Iškviečiame funkciją faktorialui apskaičiuoti
            int rezultatas = skaiciuotiFaktoriala(n);
            System.out.println("Atsakymas: " + rezultatas);
        }

        scanner.close();
    }

    public static int skaiciuotiFaktoriala(int n) {
        int faktorialas = 1; // Pradinė reikšmė (tinka ir kai n = 0, nes 0! = 1)

        // Dauginame visus skaičius nuo 1 iki N
        for (int i = 1; i <= n; i++) {
            faktorialas *= i; // Tas pats, kas: faktorialas = faktorialas * i;
        }

        return faktorialas;
    }
}

