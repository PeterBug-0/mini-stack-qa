package oops.interfaces;

public class InterfaceDemo {
    public static void main(String[] args) {
        MountainBicycle mountainBicycle = new MountainBicycle(21,31,1);
        System.out.println("Gear is: " + mountainBicycle.getGear());
        System.out.println("Bike speed is: " + mountainBicycle.getSpeed());
        System.out.println("Seat height is: " + mountainBicycle.getSeatheight());
        mountainBicycle.applyBrake(2);
        System.out.println("Bike speed after: " + mountainBicycle.getSpeed());
    }
}
