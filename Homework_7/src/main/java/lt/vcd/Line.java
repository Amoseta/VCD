package lt.vcd;

/**
 * Represents a line segment in a 2D coordinate space defined by two Point objects.
 */
public class Line {

    /**
     * The starting point of the line.
     */
    private Point p1;

    /**
     * The ending point of the line.
     */
    private Point p2;

    /**
     * Default constructor that initializes the line with two default points at (0, 0).
     */
    public Line() {
        this.p1 = new Point(0, 0);
        this.p2 = new Point(0, 0);
    }

    /**
     * Parameterized constructor that initializes the line with the specified start and end points.
     *
     * @param p1 the starting Point of the line
     * @param p2 the ending Point of the line
     */
    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    /**
     * Returns the starting point of the line.
     *
     * @return the starting Point p1
     */
    public Point getP1() {
        return p1;
    }

    /**
     * Sets a new starting point for the line.
     *
     * @param p1 the new starting Point
     */
    public void setP1(Point p1) {
        this.p1 = p1;
    }

    /**
     * Returns the ending point of the line.
     *
     * @return the ending Point p2
     */
    public Point getP2() {
        return p2;
    }

    /**
     * Sets a new ending point for the line.
     *
     * @param p2 the new ending Point
     */
    public void setP2(Point p2) {
        this.p2 = p2;
    }

    /**
     * Calculates and returns the length of the line segment between p1 and p2.
     * Reuses the distance() method from the Point class.
     *
     * @return the length of the line
     */
    public double getLength() {
        return p1.distance(p2);
    }

    /**
     * Returns a string representation of the line displaying its starting and ending points.
     *
     * @return formatted string representing the line
     */
    @Override
    public String toString() {
        return "Line [start=" + p1 + ", end=" + p2 + "]";
    }
}

