
interface A {
    void sleep();

    default void data(){
        System.out.println("hiii");
    }
}

class B implements A{
    public void sleep(){
        System.out.println("sleep!");
    }
}

public class afterJava8 {
    public static void main(String[] args) {
        B b = new B();
        b.sleep();
        b.data();
    }   
}
