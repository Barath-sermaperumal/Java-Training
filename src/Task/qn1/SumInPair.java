package Task.qn1;

public class SumInPair {
    public static void main(String[] args) {
        int array[] = new int[]{1,2,3,4,5,0}, k=5;
        SumInPair obj=new SumInPair();
        System.out.println(obj.findPair(array,k));
    }
    boolean findPair(int array[],int num){
        int count=0;
        boolean isThere=false;
        for (int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if (array[i]+array[j]==num){
                    count+=1;
                }
            }
        }
        System.out.println(count);
        if(count>0)isThere=true;
        return isThere;
    }

}
