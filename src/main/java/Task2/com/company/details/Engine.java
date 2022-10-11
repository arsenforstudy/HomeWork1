package Task2.com.company.details;

public class Engine {
   private double power;
    private String producer;

    Engine(double power, String producer) {
        this.power = power;
        this.producer = producer;
    }
    public String toString(){
        return "Engine: power - "+power+";  producer - "+producer+";";
    }
}
