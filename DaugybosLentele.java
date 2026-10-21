package lt.vcd;

import java.util.Scanner;

public class DaugybosLentele {

    static void main(String[] args) {
    System.out.print("Įveskite skaičių:");
    int n = new Scanner(System.in).nextInt();

        for (int i = 1; i <= 10; i++) {
            int rez = n * i;
            System.out.println(n + " × " + i + " = " + rez);
        }
    }

}



