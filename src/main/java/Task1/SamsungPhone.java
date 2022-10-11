package Task1;

public class SamsungPhone extends Phone implements PhoneConnection {
    SamsungPhone(String name, String model, int memory) {
        super(name, model, memory);
    }

    public void message() {
        System.out.println("*text*");
    }
    public String toString(){
        return name + " - " + model + "\nMemory: " + memory + " gb.";
    }
}
