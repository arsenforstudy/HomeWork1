package Task1;

public abstract class Phone {
    private String name;
    private String model;
    private double camera;
    private int memory;

    Phone(String name, String model, int memory) {
        this.name = name;
        this.model = model;
        this.memory = memory;
    }

    Phone(String name, String model, int memory, double camera) {
        this(name, model, memory);
        this.camera = camera;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public double getCamera() {
        return camera;
    }

    public int getMemory() {
        return memory;
    }
}