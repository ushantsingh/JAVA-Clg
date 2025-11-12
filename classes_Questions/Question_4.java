
/*Create a class Car with fields brand, model, and price. Write a method to display car details.
Create multiple objects and display info. */

class Car {
    String brand;
    char model;
    double price;

    Car(String b, char m, int p) {
        this.brand = b;
        this.model = m;
        this.price = p;

        System.out.println("Brand : "+b+"\n"+"Model : "+m+"\n"+"Price : "+p+"\n");
    }
}


public class Question_4 {
    public static void main(String[] args) {
        Car c = new Car("BMW", 'z', 5500000);
    }
}
