package lt.vcd;

/**
 * Represents a point in a two-dimensional (2D) coordinate space.
 */
public class Point {

    /**
     * The x-coordinate of the point.
     */
    private int x;

    /**
     * The y-coordinate of the point.
     */
    private int y;

    /**
     * Constructs a new Point with the specified x and y coordinates.
     *
     * @param x the initial x-coordinate
     * @param y the initial y-coordinate
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns the x-coordinate of the point.
     *
     * @return the current x-coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Sets a new value for the x-coordinate of the point.
     *
     * @param x the new x-coordinate
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Returns the y-coordinate of the point.
     *
     * @return the current y-coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Sets a new value for the y-coordinate of the point.
     *
     * @param y the new y-coordinate
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Updates both the x and y coordinates of the point to a new location.
     *
     * @param x the new x-coordinate
     * @param y the new y-coordinate
     */
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Shifts the point's location by the specified dx and dy offsets.
     *
     * @param dx the distance to move along the x-axis
     * @param dy the distance to move along the y-axis
     */
    public void translate(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    /**
     * Calculates the Euclidean distance from the origin (0, 0) to this point.
     * Formula: sqrt(x² + y²)
     *
     * @return the distance from the origin
     */
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    /**
     * Calculates the Euclidean distance between this point and another point p.
     * Formula: sqrt((x2 - x1)² + (y2 - y1)²)
     *
     * @param p the target Point to measure the distance to
     * @return the distance between the two points
     */
    public double distance(Point p) {
        int dx = this.x - p.getX();
        int dy = this.y - p.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * Returns a string representation of the point in the format [x;y].
     *
     * @return formatted coordinates string
     */
    @Override
    public String toString() {
        return "[" + x + ";" + y + "]";
    }
}

