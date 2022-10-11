package Task2.com.company.vehicles;

import Task2.com.company.details.Engine;
import Task2.com.company.professions.Driver;

public class SportCar extends Car{
    int maxSpeed;

    SportCar(String name, char carClass, double weigh, Driver driver, Engine engine, int maxSpeed) {
        super(name, carClass, weigh, driver, engine);
        this.maxSpeed = maxSpeed;
    }
}
