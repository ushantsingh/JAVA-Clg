import java.util.ArrayList;
import java.util.ListIterator;

public class Question_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);   
        list.add(2);   
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        int s = 0;
        int e = list.size()-1;
        int m = s + (e - s) / 2;

        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext() && it.nextIndex() <= m) {
            Integer x = it.next();
            System.out.println(x);
        }
        
        while (it.hasPrevious()) {
            Integer x = it.previous();
            System.out.println(x);
        }
        // System.out.println(list);
    }
}
