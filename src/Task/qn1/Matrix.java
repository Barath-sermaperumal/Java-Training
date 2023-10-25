package Task.qn1;

public class Matrix {
    public static void main(String[] args) {
        int a[][]=new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16 }};
        Matrix obj=new Matrix();
        obj.printMatrix(a);
    }
    void printMatrix(int arr[][]){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }

}
