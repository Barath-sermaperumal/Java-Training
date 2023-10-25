package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {

        //Hashset
        HashSet<Student> value=new HashSet<Student>();
        value.add(new Student(1,"Ram"));
        value.add(new Student(2,"sita"));
        value.add(new Student(2,"sita"));

        for(Student s:value){
            System.out.println(s.getRoll_no());
            System.out.println(s.getName());
        }

        HashSet<Integer> value1=new HashSet<>();
        value1.add(1);
        value1.add(2);
        value1.add(3);
        value1.add(4);
        System.out.println(value1);

        //linkedhashset
        LinkedHashSet<Integer> value2=new LinkedHashSet<>();
        value2.add(2);
        value2.add(1);
        value2.add(4);
        value2.add(3);
        System.out.println(value2);

        //Treeset
//        TreeSet<Student> Key=new TreeSet<>();
//        Key.add(new Student(1,"ramu"));
//        Key.add(new Student(2,"somu"));

        TreeSet<Integer> value3=new TreeSet<Integer>();
        value3.add(4);
        value3.add(1);
        value3.add(3);
        value3.add(2);
        System.out.println(value3);
    }
}
