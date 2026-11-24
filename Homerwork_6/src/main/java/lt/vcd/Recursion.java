package lt.vcd;

public class Recursion {
    public static int sumOfDigits(int x) {
        // Base case: kai x paprastas skaicius, grazinti x
        if (x < 10) {
            return x;
        }

        // Rekursija: prideti paskutini skaiciu (x % 10) prie likusio skaciaus sumos(x / 10)
        return (x % 10) + sumOfDigits(x / 10);
    }

    static void main(String[] args) {
        int result = sumOfDigits(1342);
        System.out.println("Sum of digits: " + result); // Output: 10
    }
}
