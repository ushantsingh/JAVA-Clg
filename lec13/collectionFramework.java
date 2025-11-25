import java.util.ArrayList;
import java.util.Scanner;

public class collectionFramework {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        // list.add(5);
        // list.add(10);
        // System.out.println(list);
        // list.add(1, 30);
        // System.out.println(list);

        // list1.add(50);
        // list.addAll(list1);
        // System.out.println(list);
        // System.out.println(list.addAll(list1));

        // System.out.println(list.get(1));
        // list.set(4, 60);
        // System.out.println(list);

        // System.out.println(list.size());

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        // list.set(2, 99);
        // System.out.println(list);
        // System.out.println(list.get(0));
        // list.remove(0);
        // System.out.println(list);
        // System.out.println(list.isEmpty());
        // System.out.println(list.clone());
        // System.out.println(list.hashCode());
        // System.out.println(list.lastIndexOf(30));
        // System.out.println(list.retainAll(list1));

        // for (int i = 0; i < list.size(); i++) {
        //     System.out.println(list.get(i));
        // }

        for (int num : list) {
            System.out.println(num);
        }
    }
}
