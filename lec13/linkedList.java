import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);
        System.out.println(list.removeLast());
        System.out.println(list.clone());
        System.out.println(list.hashCode());
        System.out.println(list.isEmpty());
        System.out.println(list.get(3));
        System.out.println(list.getFirst());
        System.out.println(list.peekFirst());
        System.out.println(list.poll());
        System.out.println(list);
        System.out.println(list.offer(80));

    }
}
