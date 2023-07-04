package Task2.com.company.vehicles;

import Task2.com.company.details.Engine;
import Task2.com.company.entities.Person;
import Task2.com.company.professions.Driver;

public class Car {
    private String name;
    private char carClass;
    private double weigh;
    private Driver driver;
    private Engine engine;

    public Car(String name, char carClass, double weigh, Driver driver, Engine engine) {
        this.name = name;
        this.carClass = carClass;
        this.weigh = weigh;
        this.driver = driver;
        this.engine = engine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public char getCarClass() {
        return carClass;
    }

    public void setCarClass(char carClass) {
        this.carClass = carClass;
    }

    public void setWeigh(double weigh) {
        this.weigh = weigh;
    }

    public double getWeigh() {
        return weigh;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
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
