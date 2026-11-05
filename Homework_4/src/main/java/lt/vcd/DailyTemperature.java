package lt.vcd;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DailyTemperature {
    public static void main() throws FileNotFoundException {
        Scanner in=new Scanner(new File("src/main/resources/duomenys.txt"));
        // 2. Nuskaitome patį pirmąjį skaičių n (dienų kiekį)
        int n = in.nextInt();

         //3. Pasiruošiame krepšelį neigiamų dienų skaičiavimui
        int negativeDays = 0;

        while (in.hasNextInt()) {
            int temp=in.nextInt();

            if (temp < 0) {
                negativeDays++; // Jei taip, pridedame 1 prie neigiamų dienų
            }
        }

        // 5. Tikriname rezultatą ir atspausdiname pagal sąlygą
        if (negativeDays ==0) {
            System.out.println("No negative temperatures recorded");
        } else {
            System.out.println(negativeDays);
        }

        in.close();
    }
}
