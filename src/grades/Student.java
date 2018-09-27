package grades;

import java.util.*;

/* Create a class named Student.
 * It should have private properties for the student's name, and grades.
 * The grades property should be an list of integers.
 * The student class should have a constructor that sets name property,
 * and initializes the grades property as an empty list. The Student class should have the following methods.
 */
public class Student {
    private String name;
    private ArrayList <Integer> grades;

    //constructor for student
    //takes in name and initializes grades to empty list
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    //overloaded constructor if grade list already created
    public Student(String name, ArrayList <Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        //adds to list
        grades.add(grade);
    }

    // returns the average of the students grades
    public int getGradeAverage() {
        //declare and initialize var
        double sum = 0;

        //adds up all grades in list
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }

        //returns average based on size of list
        return (int) Math.round(sum/grades.size());
    }

    public String toString() {
        return this.name + ", grades: " + this.grades;
    }



    /* Test your Student class by adding a main method and creating Student objects.
     * Verify that you can add grades to each object,
     * and that your getGradeAverage method correctly returns the average of the student's grades.
     */

    public static void main(String[] args) {
        Student student1 = new Student("Charles");
        System.out.println(student1.getName());

        student1.addGrade(90);
        student1.addGrade(86);
        student1.addGrade(95);
        System.out.println(student1.getGradeAverage());
    }
}
