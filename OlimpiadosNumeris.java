package lt.vcd;

import java.util.Scanner;

public class OlimpiadosNumeris {
    public static void main(String[] args) {
        Scanner skaitytuvas =  new Scanner(System.in);

        System.out.print("Įveskite metus:");

        int metai = skaitytuvas.nextInt();

        if(metai<1896){
            System.out.println(metai + " nėra olimpiniai metai");
        }
        else if((metai - 1896) % 4 ==0){
            int numeris = ((metai -1896) / 4 + 1);
            System.out.println(metai + " yra olimpiniai metai. Tai yra " + numeris + "-osios Olimpinės žaidynės.");
        }
        else {
            System.out.println(metai + " nėra olimpiniai metai.");
        }

        skaitytuvas.close();

    }

}
/*
public class OlimpiadosNumeris {
    public static void main(String[] args) {
        System.out.print("Įveskite metus: ");
        int m = new Scanner(System.in).nextInt();

        // Trys sąlygos sujungtos į vieną trumpą loginę grandinę
        String rezultatas = (m < 1896) ? m + " nėra olimpiniai metai." :
                            ((m - 1896) % 4 == 0) ? m + " yra olimpiniai metai. Tai yra " + (((m - 1896) / 4) + 1) + "-osios žaidynės." :
                            m + " nėra olimpiniai metai.";

        System.out.println(rezultatas);
    }
}
*/