package lt.vcd;

import java.util.Scanner;

    public class FloorTiling {
        static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Room length (int): ");
            int length = input.nextInt();

            System.out.print("Room width (int): ");
            int width = input.nextInt();

            System.out.print("Tile cost (one sqr meter): ");
            double cost = input.nextDouble();

            int square = length * width;

            double totalSquareExtraFive = square * 1.05;

            double finalCost = totalSquareExtraFive * cost;

            System.out.printf("Total Ssquare: %d kv. m.%n", square);
            System.out.printf("Required sum (incl. 5%% ): %.2f Eur%n", finalCost);

            input.close();
        }
    }

