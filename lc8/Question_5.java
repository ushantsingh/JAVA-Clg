
class Book {
    void read() {
        System.out.println("reading books");
    }
}

class Novels extends Book {
    void storyLine() {
        System.out.println("Lines");
    }
}


public class Question_5 {
    public static void main(String[] args) {
        Novels n = new Novels();
        n.read();
        n.storyLine();
    }
}
