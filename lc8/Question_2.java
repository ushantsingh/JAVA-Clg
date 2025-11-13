
class Person {
    void Name() {
        System.out.println("Ushant");
    }
}

class Students extends Person {
    void DisplayClass() {
        System.out.println("SEC - B");
    }
}

class Monitor extends Students {
    void CheckDecipline() {
        System.out.println("Mstt");
    }
}

public class Question_2 {
    public static void main(String[] args) {
        Monitor m = new Monitor();
        m.Name();
        m.DisplayClass();
        m.CheckDecipline();
    }
}
