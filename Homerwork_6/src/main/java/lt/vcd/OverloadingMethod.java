package lt.vcd;

public class OverloadingMethod {
    // Method for integer inputs
    public static int calculateArea(int width, int height) {
        return width * height;
    }

    // Overloaded method for double inputs
    public static double calculateArea(double width, double height) {
        return width * height;
    }

    static void main(String[] args) {
        // Testing with integers (returns int)
        int intArea = calculateArea(5, 4);
        System.out.println("Integer area: " + intArea);

        // Testing with doubles (returns double)
        double doubleArea = calculateArea(5.5, 4.2);
        System.out.println("Double area: " + doubleArea);
    }
}

