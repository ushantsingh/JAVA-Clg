// Hierarchical Inheritance 

class Animal {
    void eats() {
        System.out.println("eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barks!");
    }
}

class Cat extends Animal{
    void Meow() {
        System.out.println("Meow");
    }
}

public class Herarchical_inheritance {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();

        c.Meow();
        c.eats();

        d.bark();
        d.eats();
    }
}
