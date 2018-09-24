package shapes;


//It should have protected properties for both length and width.
// Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }

    //Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values.
    // The formulas for both follow:
    //perimeter = 2 x length + 2 x width
    //area = length x width

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return length * 2 + width * 2;
    }
}
