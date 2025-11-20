
interface A {
    void sleep();
}
interface B {
    void sleep();
}

class C implements A, B {

    public void sleep() {
        System.out.println("hi!");
    }
}

public class interfacesc2 {
    public static void main(String[] args) {
        C ccc = new C();
        ccc.sleep();
    }
}
