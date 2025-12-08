

import java.util.ArrayList;
import java.util.ListIterator;

public class Question_4 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(20);   
        list.add(10);   
        list.add(5);
        list.add(14);
        list.add(3);
        list.add(10);

        int t = 14;

        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            Integer x = it.next();
            if (x == t) {
                break;
            }
        }

        while (it.hasPrevious()) {
            Integer x = it.previous();
            if (x < t) {
                it.remove();
            }
        }
        System.out.println(list);
    }
}
