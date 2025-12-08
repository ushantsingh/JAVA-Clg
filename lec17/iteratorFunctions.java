import java.util.ArrayList;
import java.util.ListIterator;
public class iteratorFunctions {
    // ye dono direction mai move karega 
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

     while (it.hasNext()) {
         if (it.next() == 7) {
            //  it.add(10); //--> add kr deta hai 
             it.set(9); // -->value ko remove kr ke new data ko insert kr deta hai
         }
     }
     System.out.println(list);
    }
}
