// ye dono direction mai move karega 



import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorBothSide {
    public static void main(String[] args) {
     ArrayList<Integer> list=new ArrayList<>();
     list.add(5);   
     list.add(6);   
     list.add(7);
     list.add(8);

     ListIterator<Integer> it = list.listIterator();
     while (it.hasNext()) {
         System.out.println(it.next());
     }
     System.out.println();
     while (it.hasPrevious()) {
         System.out.println(it.previous());
     }
    }
}
