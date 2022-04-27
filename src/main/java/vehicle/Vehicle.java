package vehicle;

public abstract class Vehicle {
    //Properties
    protected String name;
    protected int seat;
    protected int wheel;

    //Constructor
    public Vehicle(String name, int seat, int wheel){
        this.name = name;
        this.seat = seat;
        this.wheel = wheel;
    }

    //Abstract Method

    public abstract void engineNoise();






    public String getName() {
        return name;
    }

    public int getSeat() {
        return seat;
    }

    public int getWheel() {
        return wheel;
    }
}
