
class Parent {
    int x = 10;

    Parent() {
        System.out.println("Parent Constructor : x= " + x);
    }
}

class Child extends Parent {
    int x = 20;

    Child() {
        System.out.println("Child this.x = " + this.x);
        System.out.println("Child super.x = " + super.x);
    }
    
    void show() {
        int x = 30;
        System.out.println("Local = "+x);
        System.out.println("Instant variable = "+this.x);
        System.out.println("Parent variable = "+super.x);
    }
}

public class super_keyword {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
