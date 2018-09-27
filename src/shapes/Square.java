package shapes;


public class Square extends Quadrilateral {

    //Because the length of all sides of a square are the same,
    // the methods for setting the length and the width should set both protected properties.

    public Square(double side) {
        super(side, side);
    }

    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    public void setWidth(double side) {
        this.length = side;
        this.width = side;
    }

    public double getArea() {
        return this.length * this.length;
    }

    public double getPerimeter() {
        return this.length * 4;
    }
}

