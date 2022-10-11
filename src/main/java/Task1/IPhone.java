package Task1;

public class IPhone extends Phone implements PhoneConnection, PhoneMedia {
    IPhone(String name, String model, int memory, double camera) {
        super(name, model, memory, camera);
    }

    public void message() {
        System.out.println("*text*");
    }

    public void takePhoto() {
        System.out.println("You have a photo");
    }

    public void makeVideo() {
        System.out.println("You made a video");
    }

    public String toString() {
        return name + " - " + model + "\nMemory: " + memory + " gb | " + "Camera:" + camera + " items.";
    }

}
