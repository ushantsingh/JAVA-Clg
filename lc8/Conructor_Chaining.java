

class Hello {
    public Hello() {
        this(5);//--> constructor chaining
        System.out.println("Hii");
    }

    public Hello(int x) {
        this(5, 6);//--> constructor chaining
        System.out.println(x);
    }
    public Hello(int x,int y) {
        System.out.println(y);
    }

}

public class Conructor_Chaining {
    public static void main(String[] args) {
        Hello h = new Hello();
        // Hello h1 = new Hello(7);
        // Hello h2 = new Hello(7,9);
    }
}
