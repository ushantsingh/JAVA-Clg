


class Car {

    // Car() {                  --> No Aargument costructor 
    //     System.out.println("Constructor called!");
    // }

    //parameterised constructor :-

    // Car(String str) {                   
    //             System.out.println(str);
    //         }

    int a; //--> instance variable

    Car(int a) { //--> Global variable 
        // a=b;
        // a = a;           
        this.a = a; //---> this instant variable ko point karta hai . aur separate krta hai global aur local variable ko.
        System.out.println(a);
    }
}

public class Canstructors {
    public static void main(String[] args) {
        // Car c = new Car();
        // Car obj = new Car("hii");
        // Car obj2 = new Car("Hello!");

        Car c = new Car(5);
    }
}
