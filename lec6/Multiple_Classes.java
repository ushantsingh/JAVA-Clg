
class Car {
    String name="hiii";

    void Display() {
        System.out.println("Hello!");
        System.out.println(name);
    }
}

public class Multiple_Classes {
    public static void main(String[] args) {
        Car c = new Car();
        c.Display();
    }
}
