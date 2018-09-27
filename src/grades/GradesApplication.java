package grades;

import java.util.HashMap;
import util.Input;
public class GradesApplication {
    static Input inputter = new Input();
    static HashMap<String, Student> students = new HashMap<>();


    /* Create a class named GradesApplication with a main method.
     * Inside the main method, create a HashMap named students.
     * It should have keys that are strings that represent github usernames,
     * and values that are Student objects.
     * Create at least 4 student objects with at least 3 grades each, and add them to the map.
     * Be creative! Make up github usernames and grades for your student objects.
     */

    public static void main (String[] args) {


        students.put("tcolejim", new Student("Cole"));
        students.put("coolguey", new Student("Guey"));
        students.put("zbraff", new Student("Zach"));
        students.put("bananarama", new Student("Benny"));

        for(Student student : students.values()) {
            for (int i = 0; i <=3; i++) student.addGrade((int) (Math.random() * 50 + 50));
        }

        System.out.println(students);


        String currStudent;
        boolean cont;

        //opening to application
        System.out.println("Welcome!\n");

        //while(currStudent)

        //prompt to get student to check
        do {
            displayUsernames();
            currStudent = inputter.getString("\n\nWhich student would you like to see more info about? ");

            //loop to ensure valid input entered
            //to get valid input
            if (!students.containsKey(currStudent)) {
                System.out.println("\nStudent not found!");
                displayUsernames();
                currStudent = inputter.getString("\n\nWhich student would you like to see more info about? ");
            }

            //displays info about current student
            System.out.format("%nName: %s - Github Username: %s %nCurrent Average: %d%n",
                    currStudent, students.get(currStudent), students.get(currStudent).getGradeAverage());

            //prompt to get new student
            //also saved in order to exit
            cont = inputter.yesNo("Would you like to see another student? (y/n)");
        } while (cont);
    }



    public static void displayUsernames() {
        System.out.println("Here are the github usernames of students:");
        for (String username : students.keySet()) {
            System.out.print(" |" + username + "| ");
        }
    }





    /* Create the command line interface:
     * Print the list of github usernames out to the console,
     * and ask the user which student they would like to see more information about.
     *
     * The user should enter a github username (i.e. one of the keys in your map).
     *
     * If the given input does not match up with a key in your map,
     * tell the user that no users with that username were found.
     *
     * If the given username does exist, display information about that student,
     * including their name and their grades.
     *
     * After the information is displayed, the application should ask the user if they want to continue,
     * and keep running so long as the answer is yes.
     */




    /*Bonus
     *Display all of the student's grades in addition to the grade average
     * Allow the user to view all of the grades for all of the students
     * Modify your CLI to provide an option to view the overall class average
     * Modify your CLI to provide an option to print a csv report of all the students
     *
     * Add an attendance property to your Student objects. It should be a HashMap.
     * The keys should be strings representing the date, in the format "2017-10-02",
     * and the values should be Strings that are one of:
     * "A": Absent or "P": Present
     *
     * Add a method named recordAttendance(String date, String value)
     * that adds records to the HashMap this method should make sure value is an an acceptable string
     * Create an instance method on your Student class to calculate a student's attendance percentage
        * -- (Total Days - Absences) / Total Days
     * Add the attendance information to the output of your command line interface, this should require only a small change
     * Create an instance method on Student that finds the specific days a student was absent.
     * This method should return a List of Strings, where each string is the date of the absence.
     */
}
