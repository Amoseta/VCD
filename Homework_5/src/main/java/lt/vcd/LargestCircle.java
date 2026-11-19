package lt.vcd;
import java.util.Scanner;

public class LargestCircle {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();


            int maxRadius = scanner.nextInt();
            int count = 1;


            for (int i = 1; i < n; i++) {
                int currentRadius = scanner.nextInt();

                if (currentRadius > maxRadius) {
                    maxRadius = currentRadius;
                    count = 1;
                } else if (currentRadius == maxRadius) {
                    count++;
                }
            }


            System.out.println(maxRadius + " - " + count);
        }

        scanner.close();
    }
}
