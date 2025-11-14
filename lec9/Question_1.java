package lec9;

class MultipleSum {
    void Sum(int a, int b) {
        System.out.println(a+b);
    }
    void Sum(int a, int b,int c) {
        System.out.println(a+b+c);
    }
    void Sum(double a, double b) {
        System.out.println(a+b);
    }
}

public class Question_1 {
    public static void main(String[] args) {
        MultipleSum m = new MultipleSum();
        m.Sum(5, 6);
        m.Sum(2, 5, 8);
        m.Sum(56.65, 776.98);
    }
}
