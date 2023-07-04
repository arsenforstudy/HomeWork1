package Task1;

public class SamsungPhone extends Phone implements PhoneConnection {
    SamsungPhone(String name, String model, int memory) {
        super(name, model, memory);
    }

    public void message() {
        System.out.println("Message from Samsung");
    }

    @Override
    public void call() {
        System.out.println("Calling from Samsung");
    }

    public String toString(){
        return getName() + " - " + getModel() + "\nMemory: " + getMemory() + " gb.";
    }
}
