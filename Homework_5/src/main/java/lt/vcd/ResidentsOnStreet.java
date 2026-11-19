package lt.vcd;

import java.util.Scanner;

public class ResidentsOnStreet {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int[] residents = new int[n];

            for (int i = 0; i < n; i++) {
                residents[i] = scanner.nextInt();
            }

            int totalResidents = 0;
            int leftResidents = 0;
            int rightResidents = 0;
            int leftHouses = 0;
            int rightHouses = 0;

            for (int i = 0; i < n; i++) {
                int houseNumber = i + 1;
                totalResidents += residents[i];

                if (houseNumber % 2 != 0) {
                    leftResidents += residents[i];
                    leftHouses++;
                } else {
                    rightResidents += residents[i];
                    rightHouses++;
                }
            }

            System.out.println("Total residents: " + totalResidents);
            System.out.println("Residents on the left: " + leftResidents);
            System.out.println("Residents on the right: " + rightResidents);

            System.out.print("Average per house on the left: ");
            if (leftHouses == 0) {
                System.out.println("N/A");
            } else {
                printAverage((double) leftResidents / leftHouses);
            }

            System.out.print("Average per house on the right: ");
            if (rightHouses == 0) {
                System.out.println("N/A");
            } else {
                printAverage((double) rightResidents / rightHouses);
            }
        }

        scanner.close();
    }

    // Helper method to print whole numbers without ".0" (e.g., 4 instead of 4.0)
    private static void printAverage(double avg) {
        if (avg == (long) avg) {
            System.out.println((long) avg);
        } else {
            System.out.println(avg);
        }
    }
}

