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
        Person me = new Person("Cole Jimenez");
        System.out.println(me.getName());
        me.setName("Cole da Cutie");
        System.out.println(me.getName());
        me.sayHello();
    }
}
