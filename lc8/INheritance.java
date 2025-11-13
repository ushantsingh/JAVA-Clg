// single level inheritance 


class Animal {
    void eat() {
        System.out.println("Pizza");
    }
}

class Dog extends Animal{
    void bark() {
     System.out.println("bhow bhow");   
    }
}

public class INheritance {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.bark();
        obj.eat();
    }
}
