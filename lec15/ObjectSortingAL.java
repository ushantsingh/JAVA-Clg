import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Student implements Comparable<Student> {
    int RollN;
    String name;

    public Student(int RollN, String name) {
        this.RollN = RollN;
        this.name = name;
    }

    public int compareTo(Student s1) {
        return this.RollN - s1.RollN;
    }

    public String toString() {
        return RollN + " : " + name;
    }
}
public class ObjectSortingAL {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(10, "Ushant"));
        list.add(new Student(5, "Arya"));
        list.add(new Student(11, "Tishya"));
        list.add(new Student(7, "Samarth"));
        Collections.sort(list);
        System.out.println(list.toString());
    }
}