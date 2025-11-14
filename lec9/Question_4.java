package lec9;

class Book {
    void display(String title, String author) {
        System.out.println("Title : " + title + " Author : " + author);
    }
    
    void display(String title, String author, double price) {
        System.out.println("Title : " + title + " Author : " + author+" Price : "+price);
    }
}

public class Question_4 {
    public static void main(String[] args) {
        Book b = new Book();
        b.display("Tales of ShakesSphere", "Shakesphere");
        b.display("Chemistry", "me", 450);
    }
}
