package Task.qn1;

public class Prime {
    public static void main(String[] args) {
        int start=1,end=100;
        Prime obj=new Prime();
        for(int i=start;i<end;i++) {
            obj.prime(i);
        }

    }
    void prime(int a){
        boolean flag=true;
        if(a==0||a==1){}
        else{
            for(int i=2;i<=a/2;i++){
                if(a%i==0){
                    flag = false;
                    break;
                }
            }
            if(flag) System.out.println(a);
        }

    }
}
