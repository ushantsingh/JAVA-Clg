// replace every negative value to positive 

import java.util.ArrayList;
import java.util.ListIterator;

public class Question_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(-1);   
        list.add(4);   
        list.add(-7);
        list.add(2);

        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            Integer x = it.next();
            if(x<0){
                it.set(x*-1);
            }
        }
        System.out.println(list);
    }
}
