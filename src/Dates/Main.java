package Dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date obj=new Date();

        SimpleDateFormat s=new SimpleDateFormat("EEEE dd-MMMM-yyyy");
        System.out.println(s.format(obj));
    }
}
