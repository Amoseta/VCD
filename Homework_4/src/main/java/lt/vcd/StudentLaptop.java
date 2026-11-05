package lt.vcd;

public class StudentLaptop {
    static void main() {
        int p = 800;
        int s = 250;
        int m = 75;
        int k = 0;
        while (s < p) {
            k++;
            s += m;
        }
        System.out.println(k);
    }
}
