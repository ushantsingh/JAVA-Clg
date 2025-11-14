// method Overloading 

class Hello {
    void sum() {
        System.out.println("Hello");
    }
    void sum(int a) {
        System.out.println(a);
    }
    void sum(int a, int b) {
        System.out.println(a+b);
    }

}

public class method_OverLoading {
    public static void main(String[] args) {
        Hello obj = new Hello();
        obj.sum();
        obj.sum(6);
        obj.sum(8, 9);
    }   
}
