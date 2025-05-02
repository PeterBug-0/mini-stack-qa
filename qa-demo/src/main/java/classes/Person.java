package classes;
// A class is a blueprint used to create objects.
 public class Person {
    // Fields (attributes/properties)
    String name ;
    int age;
    double height ;

    //Constructor
    public Person(String name, int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    //Methods (behaviours)
    boolean sayHello() {
        System.out.println("Hello! My name is " + name + ", I am " + age + "yrs old" + ", and my height is " + height);
        return false;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Camella",22,17.6);
        person1.sayHello();
    }
}
