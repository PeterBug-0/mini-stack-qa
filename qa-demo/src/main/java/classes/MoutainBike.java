package classes;

public class MoutainBike extends Bicycle{
    public int seatHeigth;
    public MoutainBike (int startHeight, int startSpeed, int startGear){
        super(startSpeed, startGear);
        seatHeigth = startHeight;
    }
    public void setSeatheight (int newHeight) {
        this.seatHeigth = newHeight;
    }
}

