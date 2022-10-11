package Task2.com.company.vehicles;

import Task2.com.company.details.Engine;
import Task2.com.company.entities.Person;
import Task2.com.company.professions.Driver;

public class Car {
    String name;
    char carClass;
    double weigh;
    Driver driver;
    Engine engine;

    Car(String name, char carClass, double weigh, Driver driver, Engine engine) {
        this.name = name;
        this.carClass = carClass;
        this.weigh = weigh;
        this.driver = driver;
        this.engine = engine;
    }

    void start() {
        System.out.println("Go");
    }

    void stop() {
        System.out.println("Stop");
    }

    void turnLeft() {
        System.out.println("Turn left");
    }

    void turnRight() {
        System.out.println("Turn right");
    }

    public String toString() {
        return "Car: " + name + "\nclass: " + carClass + "\nweigh: " + weigh + " rg\ndriver experience : " +
                driver.getYearsExperience() + "years" + engine.toString();
    }
}
