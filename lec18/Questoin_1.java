import java.util.ArrayList;
import java.util.Iterator;

public class Questoin_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(40);
        list.add(5);
        list.add(3);
        list.add(10);
        list.add(20);
        list.add(3);

        int s=0;
        int e=list.size();
        int mid = s + (e - s) / 2;

        Iterator<Integer> it = list.listIterator(mid);
        while (it.hasNext() ) {
            System.out.println(it.next()+" ");
        }
        System.out.println(it);
    }
}
