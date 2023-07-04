package Task1;

public interface PhoneConnection {
    default void call(){
        System.out.println("Calling..");
    }
    default void message(){
        System.out.println("*text*");
    }
}
