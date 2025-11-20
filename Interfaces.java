/*Interfaces  */

interface A {
    abstract void login();
}

// class B implements A {
//     public void login() {
//         System.out.println("Login!");
//     }
// }

interface B {
    void data();
}

class C implements A, B {
    public void login() {
        System.out.println("Login!");
    }

    public void data() {
        System.out.println("data");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        // B b = new B();
        // b.login();

        C cc = new C();
        cc.data();
        cc.login();
    }   
}
