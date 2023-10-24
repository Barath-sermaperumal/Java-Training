package Exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            dummy.dump();
        }
        catch(Exception e){
            if(e instanceof ArithmeticException){
                System.out.println("error");
            }
            else{
                System.out.println(e);
            }
        }
    }
}

class dummy{
    static void dump() throws Exception{
        throw new Exception("HelloWorld");
    }
}
