package oops.interfaces;


public class MountainBicycle implements Bicycle {
        private int seatheight;
        private int gear;
        private int speed;

        public MountainBicycle (int startHeight, int startSpeed, int startGear){
            seatheight = startHeight;
            speed = startSpeed;
            gear = startGear;
        }

    public int getSeatheight() {
        return seatheight;
    }

    public void setSeatheight(int seatheight) {
        this.seatheight = seatheight;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
        public void applyBrake (int decrement) {
           speed = speed-decrement;
        }

        @Override
        public void  speedUp(int increment){
            speed = speed+increment;
        }
}
