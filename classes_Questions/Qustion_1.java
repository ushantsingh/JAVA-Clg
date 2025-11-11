package classes_Questions;
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
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();

        s1.data("ushant ", 352, 499);
        s1.display();
        s2.data("Arya ", 355, 499);
        s2.display();
        s3.data("Samarth ", 353, 459);
        s3.display();
        s4.data("Tishya ", 354, 499);
        s4.display();
    }
}
