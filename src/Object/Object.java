package Object;

public class Object {
    String firstName="Barath";
    int age;

    public static void main(String[] args) {
        Object obj=new Object();
        System.out.println(obj);
        System.out.println(obj.firstName);

        Object obj1=new Object();
        System.out.println(obj1);
        System.out.println(obj1.firstName);
    }
}
