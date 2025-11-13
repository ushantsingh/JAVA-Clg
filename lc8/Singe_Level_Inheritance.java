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

public class Singe_Level_Inheritance {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.bark();
        obj.eat();
    }
}
