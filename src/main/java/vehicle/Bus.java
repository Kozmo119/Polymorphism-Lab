package vehicle;

import interfaces.TopSpeed;
import vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Bus extends Vehicle implements TopSpeed {
    //Properties
    boolean doubleDecker;
    int busNumber;

    //Constructor
    public Bus(String name,int seat,int wheel,boolean doubleDecker, int busNumber){
        super(name,seat,wheel);
        this.doubleDecker = doubleDecker;
        this.busNumber = busNumber;
    }

    //abstract method - subclass can only extend one parent class
    @Override
    public void engineNoise(){
        System.out.println("zzzzzzzz");
    }

    // interface method - can implement more than one interface......
    public String topSpeed(int speed){
        return this.name + " has a topspeed of " + speed + "mph";
    }




    //Getters
    public boolean isDoubleDecker() {
        return doubleDecker;
    }






}
