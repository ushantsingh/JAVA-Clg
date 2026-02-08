class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList{
    Node first;

    void inserBegning(int data) {
        Node newNode = new Node(data);
        newNode.next = first;
        first = newNode;
    }
    
    void display() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    void insertLast(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
        }
        Node temp = first;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void deleteStart() {
        if (first == null) {
            return;
        }

        // Node temp = first;
        first = first.next;
        // temp.next = null;
    }

    void deleteLast() {
        Node temp = first;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    void addBetween(int x, int y) {
    if (first == null) return;

    Node temp = first;
    while (temp != null && temp.data != x) {
        temp = temp.next;
    }

    if (temp == null) {
        return; 
    }

    Node newNode = new Node(y);
    temp.next = newNode;
    newNode.next = temp.next;
}

}
public class SL {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.inserBegning(10);
        list.inserBegning(20);
        list.inserBegning(30);
        list.inserBegning(40);
        list.inserBegning(50);
        list.inserBegning(60);
        list.addBetween(40, 90);
        // list.insertLast(30);
        // list.deleteStart();
        // list.deleteLast();
        list.display();
    }
}
