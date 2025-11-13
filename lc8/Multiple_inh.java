// Multiple level inheritance 

class Animal {
    void eat() {
        System.out.println("Eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog Barks ");
    }
}

class Puppy extends Dog {
    void Drinks() {
        System.out.println("Milk");
    }
}

public class Multiple_inh {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.Drinks();
        p.bark();
        p.eat();
    }
}
