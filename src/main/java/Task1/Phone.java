package Task1;

public abstract class Phone {
    String name;
    String model;
    double camera;
    int memory;

    Phone(String name, String model, int memory) {
        this.name = name;
        this.model = model;
        this.memory = memory;
    }

    Phone(String name, String model, int memory, double camera) {
        this(name, model, memory);
        this.camera = camera;
    }
}

interface PhoneConnection{
    default void call(){
        System.out.println("Calling..");
    }
    void message();
}
interface PhoneMedia {
    void takePhoto();
    void makeVideo();
}
