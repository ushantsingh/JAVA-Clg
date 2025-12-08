import java.util.ArrayList;
import java.util.ListIterator;

public class Question_1 {
    public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
        list.add(5);   
        list.add(6);   
        list.add(7);
        list.add(8);

        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            if ((it.next() & 1) == 1) {
                System.out.println(1);
            }
        }
    }
}
