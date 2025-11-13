

class Employee {
    void work() {
        System.out.println("Employees works!");
    }
}

class Manager extends Employee {
    void attendmeeting() {
        System.out.println("Attending meeting ");
    }
}

public class Question_1 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.attendmeeting();
        m.work();
    }
}
