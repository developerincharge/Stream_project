package polymorphism;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testBaseCarMethods() {
        Car car = new Car(8, "Base car");

        assertEquals("Base car", car.getName());
        assertEquals(8, car.getCylinders());
        assertEquals("Car -> startEngine()", car.startEngine());
        assertEquals("Car -> accelerate()", car.accelerate());
        assertEquals("Car -> brake()", car.brake());
        assertEquals(160.0, car.getTopSpeed());
        assertEquals(10.0, car.getFuelEfficiency());
    }


    @Test
    void testMitsubishiMethods() {
        Car car = new Mitsubishi(6, "Outlander VRX");

        assertEquals("Mitsubishi -> startEngine()", car.startEngine());
        assertEquals("Mitsubishi -> accelerate()", car.accelerate());
        assertEquals("Mitsubishi -> brake()", car.brake());
        assertEquals(220.0, car.getTopSpeed());
        assertEquals(12.5, car.getFuelEfficiency());
    }

    @Test
    void testFordMethods() {
        Car car = new Ford(6, "Ford Falcon");

        assertEquals("Ford -> startEngine()", car.startEngine());
        assertEquals("Ford -> accelerate()", car.accelerate());
        assertEquals("Ford -> brake()", car.brake());
        assertEquals(220.0, car.getTopSpeed());
        assertEquals(12.5, car.getFuelEfficiency());
    }

    @Test
    void testHoldenMethods() {
        Car car = new Holden(6, "Holden Commodore");

        assertEquals("Holden -> startEngine()", car.startEngine());
        assertEquals("Holden -> accelerate()", car.accelerate());
        assertEquals("Holden -> brake()", car.brake());
        assertEquals(210.0, car.getTopSpeed());
        assertEquals(11.0, car.getFuelEfficiency());
    }

    @Test
    void testTeslaMethods() {
        Tesla tesla = new Tesla(0, "Tesla Model S");

        assertEquals("Tesla -> powerOn() (Electric Start)", tesla.startEngine());
        assertEquals("Tesla -> silent accelerate()", tesla.accelerate());
        assertEquals("Tesla -> regenerative brake()", tesla.brake());
        assertEquals(250.0, tesla.getTopSpeed());
        assertEquals(0.0, tesla.getFuelEfficiency());
        assertEquals(520.0, tesla.getRangePerCharge());
    }

    @Test
    void testPolymorphismInArray() {
        Car[] cars = {
                new Car(4, "Base car"),
                new Ford(6, "Ford Edge"),
                new Mitsubishi(6, "Pajero"),
                new Holden(6, "Holden V6"),
                new Tesla(0, "Model 3")
        };

        for (Car car : cars) {
            assertNotNull(car.startEngine());
            assertNotNull(car.accelerate());
            assertNotNull(car.brake());
            assertTrue(car.getTopSpeed() > 0);

            if (car instanceof Tesla t) {
                assertEquals(520.0, t.getRangePerCharge());
            }
        }
    }


}