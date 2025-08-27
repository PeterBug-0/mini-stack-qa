package oops.inheritance;

public class Bicycle {
    // Declare vars
    protected int speed;
    protected int gear;

    // Create Constructor
    public Bicycle(int startSpeed, int startGear){
        this.gear = startGear;
        this.speed= startSpeed;
    }

    // setters and getters
    public void setGear (int newValue){
        gear = newValue;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

        public void speedUp(int increment) {
        speed += increment;
    }

    public static void main(String[] args) {

    }
}
