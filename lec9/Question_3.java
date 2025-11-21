package lec9;

class Stringggg {
    void print(String str) {
        System.out.println(str);
    }

    void print(int a) {
        System.out.println(a*a);
    }
}

public class Question_3 {
    public static void main(String[] args) {
        Stringggg s = new Stringggg();
        s.print(6);
        s.print("Ushant");
    }
}
