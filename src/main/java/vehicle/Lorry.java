package vehicle;

import interfaces.TopSpeed;
import vehicle.Vehicle;

public class Lorry extends Vehicle implements TopSpeed {

    //Constructor
    public Lorry(String name,int seat,int wheel){
        super(name,seat,wheel);
    }

    // abstract method
    public void engineNoise(){
        System.out.println("fdfdfdfdfdfd");
    }

    // interface method
    public String topSpeed(int speed){
        return this.name + "has a topspeed of " + speed + "mph";
    }

}
