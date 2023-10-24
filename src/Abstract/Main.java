package Abstract;

public class Main {
    public static void main(String[] args) {
        Car obj=new Car();
        obj.stop();
        obj.run();
        obj.fly();

        Vehicle obj1=new Car();
        obj1.swim();

    }
}
