import java.util.ArrayList;
import java.util.List;

public class API2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(10);
        list.add(23);
        list.add(13);
        list.add(18);

        List<Integer> result = list.stream().filter(n -> n > 5).filter(n->n%2 !=0).toList();
        System.out.println(result);
    }
}
