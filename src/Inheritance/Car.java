package Inheritance;

class Car extends Vehicle{
    public Car(){
        super();
    }

    Vehicle obj=new Vehicle();


    void wheels(){
        System.out.println(wheels+=5);
    }

    void getColour(){
        System.out.println("green");
    }

    void message(){
        System.out.println("secret");
    }
}
