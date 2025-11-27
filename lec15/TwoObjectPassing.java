import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int RollN;
    String name;

    public Student(int RollN, String name) {
        this.RollN = RollN;
        this.name = name;
    }
}

class Namesorted implements Comparator<Student>{
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class TwoObjectPassing {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(10, "Ushant"));
        list.add(new Student(5, "Arya"));
        list.add(new Student(11, "Tishya"));
        list.add(new Student(7, "Samarth"));
        Collections.sort(list, new Namesorted());
        for (Student s : list) {
            System.out.println(s.RollN+" : "+s.name);
        }
    }
}
