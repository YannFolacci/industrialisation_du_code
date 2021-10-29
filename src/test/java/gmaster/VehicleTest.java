package gmaster;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {

    private Vehicle vehicle;

    @BeforeEach
    public void init() {
        this.vehicle = new Vehicle("peugeot", 4);
    }

    @Test
    void should_make_noise() {
        assertEquals("bep bep", vehicle.noise());
    }

    @Test
    void accident_lost_wheels() {
        vehicle.setWheels(3);
        assertEquals(3, vehicle.getWheels());
    }
}