package Abstract;

public class Car extends Vehicle {
    @Override
    void stop(){
        System.out.println("stop");
    }

    @Override
    public void swim() {
        System.out.println("swim");
    }

    void fly(){
        System.out.println("fly");
    }

}
