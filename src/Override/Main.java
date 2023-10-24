package Override;

public class Main {
    public static void main(String[] args) {
        //upcasting
        Vehicle obj=new Car();
        obj.run();
        obj.fly();

        //downcasting
        Car obj1=(Car) obj;
        obj1.swim();

        Vehicle obj2=new Vehicle();
        obj2.run();

        Car obj3=new Car();
        obj3.run();


    }
}
