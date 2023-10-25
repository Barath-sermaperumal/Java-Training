package Collection;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> array=new ArrayList<>();
        //set values
        array.add(new Student(1,"Barath"));
        array.add(new Student(2,"Sravani"));
        array.add(new Student(3,"Sowmiya"));
        array.add(new Student(4,"Roobinee"));
        array.add(new Student(5,"Dharun"));

        Student stdSetter=new Student();
        stdSetter.setName("Kowsik");
        stdSetter.setRoll_no(6);
        array.add(stdSetter);

        Student std=new Student(7,"Ram");
        array.add(std);

        //Updating
        array.set(0,new Student(1,"Bubblu"));

        //Removing
        //array.remove(5);

        for (Student s:array){
            System.out.println(s.getRoll_no());
            System.out.println(s.getName());
        }
    }
}
