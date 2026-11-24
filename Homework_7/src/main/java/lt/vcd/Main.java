package lt.vcd;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // --- TASK 1: Point Class ---
        Point p1 = new Point(3, 4);
        System.out.println("Initial p1: " + p1); // Expected: [3;4]

        System.out.println("Distance from origin: " + p1.distanceFromOrigin()); // Expected: 5.0

        p1.setX(5);
        p1.setY(3);
        System.out.println("After setters (x=" + p1.getX() + ", y=" + p1.getY() + "): " + p1); // Expected: [5;3]

        p1.translate(2, 1);
        System.out.println("After translate(2, 1): " + p1); // Expected: [7;4]

        p1.setLocation(1, 2);
        System.out.println("After setLocation(1, 2): " + p1); // Expected: [1;2]

        Point p2 = new Point(4, 6);
        System.out.println("Second point p2: " + p2); // Expected: [4;6]
        System.out.println("Distance between p1 and p2: " + p1.distance(p2)); // Expected: 5.0

        System.out.println("\n--- TASK 2: Line Class ---");

        // 1. Test default constructor
        Line defaultLine = new Line();
        System.out.println("Default line: " + defaultLine); // Expected: Line [start=[0;0], end=[0;0]]
        System.out.println("Default line length: " + defaultLine.getLength()); // Expected: 0.0

        // 2. Test parameterized constructor
        Point startPoint = new Point(1, 2);
        Point endPoint = new Point(4, 6);
        Line customLine = new Line(startPoint, endPoint);
        System.out.println("Custom line: " + customLine); // Expected: Line [start=[1;2], end=[4;6]]
        System.out.println("Custom line length: " + customLine.getLength()); // Expected: 5.0

        // 3. Test getters and setters
        customLine.setP1(new Point(0, 0));
        customLine.setP2(new Point(3, 4));
        System.out.println("Updated line start: " + customLine.getP1()); // Expected: [0;0]
        System.out.println("Updated line end: " + customLine.getP2()); // Expected: [3;4]
        System.out.println("Updated line length: " + customLine.getLength()); // Expected: 5.0
    }
}

