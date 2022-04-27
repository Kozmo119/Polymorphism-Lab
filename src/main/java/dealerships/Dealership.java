package dealerships;

import vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private ArrayList<Vehicle> vehicles;

    public void Dealership(){
        this.vehicles = new ArrayList<Vehicle>();
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

    public ArrayList<Vehicle> getVehicles(){
        return this.vehicles;
    }






}
