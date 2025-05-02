package oops;

import classes.MoutainBike;

public class InheritConcept {
    public static void main(String[] args) {
        MoutainBike mountainBike = new MoutainBike(10,20,1);
        System.out.println("Gear is: " + mountainBike.gear);
        System.out.println( "Seat height is: " + mountainBike.seatHeigth);
        System.out.println("Bike speed is: " + mountainBike.speed);
        mountainBike.applyBrake(5);
        System.out.println("Bike speed after applying brake is: " + mountainBike.speed);
    }
}
