package oops.inheritance;

public class Car {
    // Declare vars
    protected int speed;
    protected String color;
    protected String model;
    protected int year;

    // Create Constructor
    public Car( int carSpeed, String carColor, String carModel, int carYear){
        this.speed = carSpeed;
        this.model = carModel;
        this.color = carColor;
        this.year = carYear;
    }
    // setters and getters
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }

    public String getColor() { return color;}

    public int getYear() {
        return year;
    }
    @Override
    public String toString(){
        return ("The speed of car is : " + this.getSpeed() + ", the color is: " + this.getColor() + ", the model is: " + this.getModel() + "and the year of make is: " + this.getYear());
    }

    public static void main(String[] args) {
        Car camry = new Car(10,"red","Toyota", 2019);
        System.out.println(camry.getModel());
        System.out.println(camry.getSpeed());
        System.out.println(camry.getColor());
        System.out.println(camry.getYear());
        }
}