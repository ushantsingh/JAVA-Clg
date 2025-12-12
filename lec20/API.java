// nomenclature kuch bhi kr skte hai
// filter function stream pe hee kaam karta hai .Ye condition pe kaam krta hai
// map function loop ke tarah hota hai. ye condition pe kaam nhi karta hai
// reduce ---> 


import java.util.*;

public class API {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        List<Integer> result = list.stream().filter(n -> n > 6).toList();
        List<Integer> mapResult = list.stream().map(n->n*2).toList();
        int reduce = list.stream().reduce(0, (a, b) -> a + b);

        System.out.println(result);
        System.out.println(mapResult);
        System.out.println(reduce);
    }
}
