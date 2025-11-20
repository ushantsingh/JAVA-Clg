/*Create an abstract class 'Animal' with method 'sound()'. Create classes 'Dog' and 'Cat' that extend
it and implement the sound method. */

abstract class Animal{
    abstract void sound();
}

class Dog extends Animal{
    String str;

    public Dog() {
        this.str = str;
    }

    void sound(){
        System.out.println("bark!");
    }
}
class Cat extends Animal{
    String str;

    public Cat() {
        this.str = str;
    }

    void sound(){
        System.out.println("meaow");
    }
}

public class question2 {
    public static void main(String[] args) {
       
        
    }
}
