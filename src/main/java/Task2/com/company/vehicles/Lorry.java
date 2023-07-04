package Task2.com.company.vehicles;

import Task2.com.company.details.Engine;
import Task2.com.company.professions.Driver;

public class Lorry extends Car {
    private int CarryingCapacity;

    public Lorry(String name, char carClass, double weigh, Driver driver, Engine engine, int carryingCapacity) {
        super(name, carClass, weigh, driver, engine);
        this.CarryingCapacity = carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        CarryingCapacity = carryingCapacity;
    }

    public int getCarryingCapacity() {
        return CarryingCapacity;
    }
    void start() {
        System.out.println("Lorry goes");
    }

    void stop() {
        System.out.println("Lorry stops");
    }

    void turnLeft() {
        System.out.println("Lorry turns left");
    }

    void turnRight() {
        System.out.println("Lorry turns right");
    }
}
