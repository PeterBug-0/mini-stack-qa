package oops.inheritance;

public class MoutainBike extends Bicycle {
    
    public int seatheight;
    
    public MoutainBike (int startHeight, int startSpeed, int startGear){
        super(startSpeed, startGear);
        seatheight = startHeight;
    }
    
    public void setSeatheight (int newHeight) {
        this.seatheight = newHeight;
    }
    public int getSeatheight(){
        return seatheight;
    }

    public static void main(String[] args) {
        MoutainBike moutainBike = new MoutainBike(12,10,1);
        System.out.println("Gear is: " + moutainBike.gear);
        System.out.println("Bike speed is: " + moutainBike.speed);
        System.out.println("Seat height is: " + moutainBike.seatheight);
        moutainBike.applyBrake(2);
        System.out.println("Bike speed after: " + moutainBike.speed);
    }
}

