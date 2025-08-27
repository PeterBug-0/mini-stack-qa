package oops.inheritance;

public class InheritConcept {
    public static void main(String[] args) {
        MoutainBike mountainBike = new MoutainBike(10,20,1);
        // Below will not run because of accessModifier rules of gear and speed.
        //  System.out.println("Gear is: " + mountainBike.gear);
        System.out.println( "Seat height is: " + mountainBike.seatheight);
        //System.out.println("Bike speed is: " + mountainBike.speed);
        mountainBike.applyBrake(5);
        // System.out.println("Bike speed after applying brake is: " + mountainBike.speed);
        // Diamond problem: A child class not knowing whic parent to follow, so Java does not accept multiple classes

    }
}
