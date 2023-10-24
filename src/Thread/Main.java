package Thread;

public class Main extends Thread{
    public static void main(String[] args) {
        a obj1=new a();
        obj1.start();
        b obj2=new b();
        obj2.start();
    }
}

class a extends Thread{
    public void run(){
        for (int j = 10; j < 20; j++) {
            System.out.println(j);
        }
    }
}

class b extends Thread{
    public void run() {
        System.out.println("Thread running successfully");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}