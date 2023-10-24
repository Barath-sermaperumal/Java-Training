package Class;

public class Class {
    void fun(){
        System.out.println("Hello commander");
    }
    public static void main(String[] args) {
        Class obj=new Class();
        obj.fun();
        A obj1=new A();
        obj1.fun1();
    }
}

class A{
    void fun1(){
        System.out.println("Hello bubblu");
    }
}

class C{
    void fun2(){
        System.out.println("Hello subash");
    }
}
