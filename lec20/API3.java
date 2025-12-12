import java.util.*;

public class API3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        List<Integer> result = list.stream().filter(n -> n > 6).toList();
        List<Integer> mapResult = list.stream().map(n->n*2).toList();
        int reduce = list.stream().reduce(0, (a, b) -> a + b);
        List<Integer> skip = list.stream().skip(2).toList();
        List<Integer> limit = list.stream().limit(2).toList();
        List<Integer> sort = list.stream().sorted((a, b) -> a - b).toList();

        // System.out.println(result);
        // System.out.println(mapResult);
        // System.out.println(reduce);
        System.out.println(skip);
        System.out.println(limit);
        System.out.println(sort);
    }
}
