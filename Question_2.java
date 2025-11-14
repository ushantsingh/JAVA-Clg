
class Areas {
    void area(int r) {
        System.out.println(Math.PI * r * r);
    }

    void area(int l, int b) {
        System.out.println(l * b);
    }

    // void area(int s) {
    //     System.out.println(s*s);
    // }
}

public class Question_2 {
    public static void main(String[] args) {
        Areas a = new Areas();
        a.area(6);
        a.area(6, 8);
        // a.Square(7);
    }   
}
