/** Represents an rectangle.
 * @author YOUR_NAME
 * TODO: Is this an abstract or concrete method? Is it a parent or child class? 
 * Is it public or private?
 */
/*TODO*/ class Rectangle extends Shape/*TODO*/ {

    private double length, height;

    Rectangle(Point upperLeft, double length, double height) {
        this.position = upperLeft;
        this.length = length;
        this.height = height;
    }

    //TODO: What methods must be implemented? Implement them.
    public double computeArea(){
        //A = length * height
        return length*height;
    }

    @Override
    public double getPerimter() {
        return 2*(length + height);
    }

    @Override
    public String getType() {
        return "Rectangle";
    }



//   upperLeft.getX();
//   upperLeft.getY();


}