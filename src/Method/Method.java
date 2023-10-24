package Method;

public class Method {
    public static void main(String[] args) {
        Dummy obj=new Dummy();
        obj.m1();
        obj.m1("Overloading");
        Dummy.m2();
    }
}

class Dummy{
    void m1(){
        System.out.println("method 1");
    }

    void m1(String msg){
        System.out.println(msg);
    }

    static void m2(){
        System.out.println("method 2");
    }
}