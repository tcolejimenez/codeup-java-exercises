package shapes;

public class ShapesTest {


    //Test your code by creating a new class, ShapesTest (also inside of shapes) with a main method. Inside the main method,
    //create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5
    public static void main (String[] args) {
        Rectangle box1 = new Rectangle(5, 4);

        //verify that the getPerimeter and getArea methods return 18 and 20, respectively.
        System.out.println("The perimeter of box 1 is " + box1.getPerimeter() + ". ");
        System.out.println("The area of box 1 is " + box1.getArea() + ". ");



        //create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
        //verify that the getPerimeter and getArea methods return 20 and 25, respectively.
        Square box2 = new Square(5);
        System.out.println("The perimeter of box 2 is " + box2.getPerimeter() + ". ");
        System.out.println("The area of box 2 is " + box2.getArea() + ". ");


        Measurable myShape;
        myShape = new Square(3);
        System.out.println("The area of my Shape is " + myShape.getArea() + ". ");
        myShape = new Rectangle(3, 4);
        System.out.println("The area of my Shape is now " + myShape.getArea() + ". ");
//        System.out.println("Heads up, the length of my Shape is " + myShape.getLength() + ". ");


    }
}
