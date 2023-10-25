package Collection;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<Integer,String> sc=new HashMap<>();
        sc.put(1,"Ram");
        sc.put(2,"sita");
        sc.replace(2,"sitaRamam");
        System.out.println(sc);
    }
}
