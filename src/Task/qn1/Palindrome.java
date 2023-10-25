package Task.qn1;

public class Palindrome {
    public static void main(String[] args) {
        int numb=1441;
        Palindrome obj=new Palindrome();
        if(obj.palindrome(numb)) System.out.println("palindrome");
        else System.out.println("not a palindrome");
    }

    boolean palindrome(int num) {
        int temp=0,sum=0,n=num;
        boolean isTrue=false;
        while(num>0){
            temp=num%10;
            sum=sum*10+temp;
            num=num/10;
        }
        if(n==sum){
            isTrue=true;
        }
        return isTrue;
    }
}
