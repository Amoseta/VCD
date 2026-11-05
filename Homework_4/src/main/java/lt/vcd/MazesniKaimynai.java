package lt.vcd;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MazesniKaimynai {
    static void main(String[] args) {
        // Failo pavadinimas
        String failoVardas = "duomenys.txt";

        try {
            File failas = new File(failoVardas);
            Scanner skaitiklis = new Scanner(failas);

            // Tikriname, ar faile yra skaičių kiekis n
            if (!skaitiklis.hasNextInt()) {
                System.out.println("Failas tuščias arba neteisingas formatas.");
                skaitiklis.close();
                return;
            }

            // Nuskaitome bendrą skaičių kiekį
            int n = skaitiklis.nextInt();

            // Jei skaičių mažiau nei 2, palyginti kaimynų neįmanoma
            if (n < 2) {
                System.out.println(0);
                skaitiklis.close();
                return;
            }

            int mazesniuKiekis = 0;

            // Nuskaitome patį pirmąjį skaičių (jis neturi kairiojo kaimyno)
            int ankstesnis = skaitiklis.nextInt();

            // Ciklu einame per likusius n - 1 skaičius
            for (int i = 1; i < n; i++) {
                if (skaitiklis.hasNextInt()) {
                    int dabartinis = skaitiklis.nextInt();

                    // Jei dabartinis skaičius mažesnis už kairįjį (ankstesnį), didiname skaitiklį
                    if (dabartinis < ankstesnis) {
                        mazesniuKiekis++;
                    }

                    // Dabartinis skaičius tampa „ankstesniu“ kitai iteracijai
                    ankstesnis = dabartinis;
                }
            }

            // Uždarome skaitiklį ir išvedame rezultatą
            skaitiklis.close();
            System.out.println(mazesniuKiekis);

        } catch (FileNotFoundException e) {
            System.out.println("Klaida: Nepavyko rasti failo " + failoVardas);
        }
    }
}

