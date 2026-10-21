package lt.vcd;

public class SkaiciausPaieska {
    static void main(String[] args) {
        // Kadangi ieškome dviženklio skaičiaus, dešimčių skaitmuo gali būti nuo 1 iki 9
        for (int desimtys = 1; desimtys <= 9; desimtys++) {
            // Vienetų skaitmuo gali būti nuo 0 iki 9
            for (int vienetai = 0; vienetai <= 9; vienetai++) {

                // 1 sąlyga: dešimčių skaitmuo yra perpus mažesnis už vienetų skaitmenį
                if (desimtys * 2 == vienetai) {

                    // Sudarome pradinį ir apverstą skaičius
                    int pradinisSkaicius = desimtys * 10 + vienetai;
                    int apverstasSkaicius = vienetai * 10 + desimtys;

                    // 2 sąlyga: apverstas skaičius yra 36 didesnis už pradinį
                    if (apverstasSkaicius == pradinisSkaicius + 36) {
                        System.out.println("Mokinio sugalvotas skaičius yra: " + pradinisSkaicius);
                        System.out.println("Patikrinimas: " + apverstasSkaicius + " - " + pradinisSkaicius + " = " + (apverstasSkaicius - pradinisSkaicius));
                    }
                }
            }
        }
    }
}

