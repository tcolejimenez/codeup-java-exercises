package shapes;

import util.Input;

public class CircleApp {

    public static void main (String[] args) {
        //let's create a circle!
        //we'll prompt the user for a radius then construct the
        //circle with that info

        Input inputter = new Input();
        do {
            System.out.println("Let's create a circle!");
            Circle testCircle = new Circle(Input.getDouble("Please enter the desired radius:"));
            System.out.println("The area of your circle is: " + testCircle.getArea());
            System.out.println("The circumference of your circle is: " + testCircle.getCircumference());
        } while (inputter.yesNo("Would you like to create another circle?"));

        System.out.println("You created " + Circle.getTotalCircles() + " circles! Yay for you! ");



    }
}
