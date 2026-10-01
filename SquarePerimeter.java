package lt.vcd;

import java.util.Scanner;

public class SquarePerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Write x1: ");
        int x1 = input.nextInt();
        System.out.print("Write y1: ");
        int y1 = input.nextInt();

        System.out.print("Write x2: ");
        int x2 = input.nextInt();
        System.out.print("Write y2: ");
        int y2 = input.nextInt();

        int length = Math.abs(x2 - x1);
        int width = Math.abs(y1 - y2);

        int s = length * width;
        int p = 2 * (length + width);

        System.out.print("s = " + s);
        System.out.print("p = " + p);

        input.close();
    }
}

