/** Represents an shape.
 * @author YOUR_NAME
 * TODO: Is this an abstract or concrete method? Is it a parent or child class? Is it public or private?
 */
/*TODO*/  abstract class Shape /*TODO*/ {

    protected Point position;
    private static int numShapes = 0;
    private static int id;

    //TODO: Create a getter and setter for member fields


    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public static int getNumShapes() {
        return numShapes;
    }

    public static void setNumShapes(int numShapes) {
        Shape.numShapes = numShapes;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Shape.id = id;
    }

    /**
     * This method computes the area
     * @return double. Returns the area of the shape.
     */
    abstract public double computeArea();

    /**
     * TODO
     * getPerimter Abstract method
     * @return String for the object called.
     */
    abstract public double getPerimter();

    /**
     * TODO
     * getType Abstract method
     * @return String for the object called.
     */
    abstract public String getType();


}