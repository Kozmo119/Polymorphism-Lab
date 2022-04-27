import dealerships.Dealership;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vehicle.Bus;
import vehicle.Coach;
import vehicle.Lorry;
import vehicle.Vehicle;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DealershipTest {
    Dealership dealership;
    Vehicle vehicle;
    Bus bus;
    Lorry lorry;
    Coach coach;


    @BeforeEach
    public void setUp(){
        bus = new Bus("bus1",60,4,true,390);
        // bus.topSpeed(60);//
        dealership = new Dealership();
    }

    @Test
    public void addBusToDealership() {
        dealership.addVehicle(bus);
        assertThat(dealership.getVehicles().size()).isEqualTo(1);

    }

}
