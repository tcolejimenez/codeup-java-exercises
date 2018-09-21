package shapes;

public class Circle {
    private double radius;
    private static int totalCircles;

    public Circle(double radius) {
        this.radius = radius;
        totalCircles++;
    }

    public double getRadius() {
        return this.radius;
    }
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public static int getTotalCircles(){
        return totalCircles;
    }

}
