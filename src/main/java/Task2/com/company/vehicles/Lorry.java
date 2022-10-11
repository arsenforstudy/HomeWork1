package Task2.com.company.vehicles;

import Task2.com.company.details.Engine;
import Task2.com.company.professions.Driver;

public class Lorry extends Car {
    int CarryingCapacity;

    Lorry(String name, char carClass, double weigh, Driver driver, Engine engine, int carryingCapacity) {
        super(name, carClass, weigh, driver, engine);
        this.CarryingCapacity = carryingCapacity;
    }


}
