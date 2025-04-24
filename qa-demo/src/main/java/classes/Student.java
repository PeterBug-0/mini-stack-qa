package classes;
public class Student {
    // An object is an instance of a class
    //Encapsulation
    private String name;
    private  int age;
    private String address;

    // Create student constructor
    public Student (String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //Set properties
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress (String address){
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress (){
         return address;
    }

    @Override
    public  String toString(){
        return ("Student name is " + this.getName() + " + age is " + this.getAge() + " an address is " + this.getAddress());
    }

    public static void main(String[] args) {
        Person newUser = new Person("James",26,21.0);
        Student john = new Student("John", 23, "24 New road, San Francis");

        System.out.println(john.getName());
        System.out.println(john.getAge());
        System.out.println(john.getAddress());
        System.out.println(newUser.sayHello());
    }

}