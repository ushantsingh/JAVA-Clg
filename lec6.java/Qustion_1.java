/*Create a class Student with fields name, rollNumber, and marks. Write a method to display
student details. Create 3 student objects and display their data. */



class Student {
    String name;
    int rollNo;
    int marks;

    void data(String n, int rn, int m) {
        this.name = n;
        this.marks = m;
        this.rollNo = rn;
    }
    void display() {
        System.out.println("Name : "+name+", Roll No. : "+rollNo+", Marks : "+marks);
    }
}

public class Qustion_1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.data("ushant ", 352, 499);
        s.display();
    }
}
