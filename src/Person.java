public class Person {

    private String name;

    //constructor accepts string and sets the person's name
    public Person (String name) {
        this.name = name;
    }

    // returns the person's name
    public String getName() {
        return name;
    }

    // changes the name property to the passed value
    public void setName(String name) {
        this.name = name;

    }

    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.println("Hello from " + this.name + "!");
    }


    public static void main(String[] args) {

        System.out.println("Number 1");
        Person me = new Person("Cole Jimenez");
        System.out.println(me.getName());
        me.setName("Cole da Cutie");
        System.out.println(me.getName());
        me.sayHello();


        System.out.println("Code block 3");
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        System.out.println(person1 == person2);







    }
}
