import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));


        //Create an array that holds 3 Person objects.
        // Assign a new instance of the Person class to each element.
        // Iterate through the array and print out the name of each person in the array.

        Person[] people = {new Person("Larry"), new Person("Moe"), new Person("Curly")};

        printPeeps(people);

        people = addPerson(people, new Person("Homegirl"));

        printPeeps(people);
    }

    //Create a static method named addPerson.
    // It should accept an array of Person objects,
    // as well as a single person object to add to the passed array.
    //
    // It should return an array whose length is 1 greater than the passed array,
    // with the passed person object at the end of the array.

    public static Person[] addPerson (Person[] oldArray, Person newPerson) {
        //create new array with updated length
        //old length + 1
        Person[] newArray = new Person[oldArray.length+1];

        //fill new array with values from old array
        for (int i =0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }

        //add last element (new person)
        newArray[oldArray.length] = newPerson;

        return newArray;
    }

    public static void printPeeps (Person[] peeps) {
        for (Person person : peeps) {
            System.out.println(person.getName());
        }
    }
}
