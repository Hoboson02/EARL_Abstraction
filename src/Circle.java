/** Represents an circle.
 * @author YOUR_NAME
 * TODO: Is this an abstract or concrete method? Is it a parent or child class? Is it public or private?
 */
/*TODO*/ class Circle extends Shape/*TODO*/ {

    private double radius;
    private double pi = 3.14;

    public Circle(Point center, double radius) {
        this.radius = radius;
        this.position = center;
    }

    //TODO: What methods must be implemented? Implement them.
    public double computeArea() {
        //A= pi * (radius^2)
        return (pi*(radius*radius));
    }

    @Override
    public double getPerimter() {
        //circumference = 2 * pi * radius
        return (2*pi*radius);
    }

    @Override
    public String getType() {
        return "Circle";
    }

}