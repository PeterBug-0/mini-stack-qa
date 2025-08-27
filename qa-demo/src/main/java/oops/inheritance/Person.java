package oops.inheritance;
// A class is a blueprint used to create objects.
public class Person {
    // Fields (attributes/properties)
    private String name ;
    private int age;
    private double height ;
    private String address;

    //Constructor
    public Person(String name, int age, double height, String address){
        this.name = name;
        this.age = age;
        this.height = height;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //Methods (behaviours)
    boolean sayHello() {
        System.out.println("Hello! My name is " + name + ", I am " + age + "yrs old" + ", and my height is " + height);
        return false;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Camella",22,17.6, "12 Nompi pascder");
        person1.sayHello();
    }
}
