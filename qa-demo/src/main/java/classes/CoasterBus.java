package classes;

public class CoasterBus extends Car {
    public String seatLength;

    public CoasterBus (String busSeatLength, int carspeed, String carModel, String carColor, int carYear){
        super(carspeed,carColor,carModel,carYear);
        this.seatLength = busSeatLength;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

}
