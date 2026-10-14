package lt.vcd;

import java.util.Scanner;

public class KeliaMetai {
    static void main(String[] args) {
        System.out.print("Įveskite metus: ");
        int metai = new Scanner(System.in).nextInt();

        // Sąlyga sąlygoje (nested if) struktūra
        if (metai % 4 == 0) {
            if (metai % 100 == 0) {
                if (metai % 400 == 0) {
                    System.out.println(metai + " yra keliamieji metai.");
                } else {
                    System.out.println(metai + " yra nekeliamieji metai.");
                }
            } else {
                System.out.println(metai + " yra keliamieji metai.");
            }
        } else {
            System.out.println(metai + " yra nekeliamieji metai.");
        }
    }
}

