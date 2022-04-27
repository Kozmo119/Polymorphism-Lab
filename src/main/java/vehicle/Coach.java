package vehicle;

import interfaces.TopSpeed;
import vehicle.Vehicle;

public class Coach extends Vehicle implements TopSpeed {
    //properties
    private boolean toilet;

    //Constructor
    public Coach(String name,int seat,int wheel,boolean toilet){
        super(name,seat,wheel);
        this.toilet = toilet;
    }
    //abstract method
    @Override
    public void engineNoise(){
        System.out.println("brrruuuuuuu");
    }

    // interface method
    public String topSpeed(int speed){
        return this.name + "has a topspeed of " + speed + "mph";
    }

}
