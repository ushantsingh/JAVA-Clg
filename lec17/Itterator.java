import java.util.ArrayList;
import java.util.Iterator;

public class Itterator {
    public static void main(String[] args) {
     ArrayList<Integer> list=new ArrayList<>();
     list.add(5);   
     list.add(6);   
     list.add(7);
     list.add(8);
     
     Iterator<Integer> it = list.iterator();     //--> Used in PDF 
     while (it.hasNext()) {
         Integer x = it.next();
         System.out.println(x);
         if (x == 6) {
             it.remove();
         }
     }
        System.out.println(list);
    }
}
