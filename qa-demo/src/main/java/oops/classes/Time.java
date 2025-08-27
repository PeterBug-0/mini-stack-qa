package oops.classes;

public class Time {

    private int hour;
    private int minutes;
    private int seconds;

    public Time (int hour,int minutes,int seconds){
        this.hour = hour;
        this.seconds = seconds;
        this.minutes = minutes;
    }
    public int getHour(){
        return hour;
    }
    public int getMinutes() {
        return minutes;
    }
    public int getSeconds() {
        return seconds;
    }
    public void setHour(int hour){
        this.hour = hour;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public static void main(String[] args) {

    }
}
