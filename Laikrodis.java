package lt.vcd;

import java.util.Scanner;

public class Laikrodis {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Įveskite h m s: ");
        int h = sc.nextInt(), m = sc.nextInt(), s = sc.nextInt();

        // Pridedame vieną sekundę ir tikriname sąlygas sąlygoje
        if (++s == 60) {
            s = 0;
            if (++m == 60) {
                m = 0;
                if (++h == 24) h = 0;
            }
        }

        System.out.printf("Laikas po 1 sek.: %02d:%02d:%02d\n", h, m, s);
    }
}

