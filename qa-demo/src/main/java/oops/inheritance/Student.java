package oops.inheritance;

// An object is an instance of a class
public class Student extends Person {
// Student (child) is derived from Parent (Person) class

    //Encapsulation
    private int admissionNumber;

    // Create student constructor
    public Student ( String name,
                    int age,
                    double height,
                    String address,
                    int studentAdmissionNumber){
        super(name,age,height,address);
        this.admissionNumber = studentAdmissionNumber;
    }

    //Set properties
    
    public void setAdmissionNum (int admissionNumber){
        this.admissionNumber = admissionNumber;
    }
    public int getAdmissionNumber (){
         return admissionNumber;
    }

    @Override
    public  String toString(){
        return ("Student name is " + this.getName() + " + age is " + this.getAge() + " an address is " + this.getAddress() + " with admission number " + this.getAdmissionNumber());
    }

    public static void main(String[] args) {
        Student student = new Student("student", 23, 4.5,"No 14 student Doe", 432);
        student.setAdmissionNum(123);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getAdmissionNumber());
        //System.out.println(student.sayHello());
    }
}