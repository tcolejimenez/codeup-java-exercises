package shapes;


//Square should define a constructor that accepts one argument, side,
// and calls the parent's constructor to set both the length and width to the value of side.
public class Square extends Rectangle {

    public Square (double side) {
        super(side, side);
    }

    //In the Square class, override the getArea and getPerimeter methods with the following definitions for a square
    //perimeter = 4 x side
    //area = side ^ 2
    public double getArea() {
        System.out.println("Square version");
        return this.length * this.length;
    }

    public double getPerimeter() {
        System.out.println("Square version");
        return this.length * 4;
    }

}

