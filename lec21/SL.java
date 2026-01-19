class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList{
    Node head;

    void inserBegning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
public class SL {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.inserBegning(10);
        list.inserBegning(20);
        list.display();
    }
}
