package Task1;

public class User {
    public static void main(String[] args) {
        IPhone iphone1 = new IPhone("IPhone", "12 pro", 128, 3 );
        System.out.println(iphone1);
        iphone1.call();
        iphone1.message();
        iphone1.makeVideo();
        iphone1.takePhoto();

        System.out.println("--------------------------------");

        SamsungPhone samsung1 = new SamsungPhone("Samsung", "C3010", 15);
        System.out.println(samsung1);
        samsung1.call();
        samsung1.message();
    }
}
