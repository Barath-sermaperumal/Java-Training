package Inheritance;

import Interface.Vehicle;

public class Inheritance {
    public static void main(String[] args) {
        Car obj=new Car();
        obj.getColour();
        System.out.println(obj.wheels);
        obj.message();
        obj.good();
        obj.wheels();
    }
}


