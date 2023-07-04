package Task2.com.company.vehicles;

import Task2.com.company.details.Engine;
import Task2.com.company.professions.Driver;

public class SportCar extends Car{
    private int maxSpeed;

    public SportCar(String name, char carClass, double weigh, Driver driver, Engine engine, int maxSpeed) {
        super(name, carClass, weigh, driver, engine);

        this.maxSpeed = maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    void start() {
        System.out.println("Sport car goes");
    }

    void stop() {
        System.out.println("Sport car stops");
    }

    void turnLeft() {
        System.out.println("Sport car turns left");
    }

    void turnRight() {
        System.out.println("Sport car turns right");
    }
}
