package Task.qn1;

public class Fibonacci {
    public static void main(String[] args) {
        int first=0,second=1;
        Fibonacci obj=new Fibonacci();
        obj.fibonacciSeries(first,second);
    }
    void fibonacciSeries(int a,int b){
        int c=0;
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<10;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
}
