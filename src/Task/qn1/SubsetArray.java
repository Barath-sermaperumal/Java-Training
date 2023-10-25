package Task.qn1;

public class SubsetArray {
    public static void main(String[] args) {
        int array1[]=new int[]{ 3, 5, 7, 12, 1, 9, 10, 0, 2 }, array2[] = new int[]{ 6, 3, 8 };
        SubsetArray obj=new SubsetArray();
        System.out.println(obj.findSubset(array1,array2));
    }
    boolean findSubset(int a[],int b[]){
        int count=0;
        boolean isTrue=false;
        for(int i=0;i<b.length;i++){
            for(int j=0;j<a.length;j++){
                if(b[i]==a[j]){
                    count+=1;
                }
            }
        }
        if(count==b.length) isTrue=true;
        return isTrue;
    }

}
