import java.util.HashSet;

public class Question3 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 ,5,12};
        int arr2[] = { 1, 2, 3, 4 };
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for (int x : arr) {
            set.add(x);
        }
        for (int y : arr2) {
            if (set.contains(y)) {
                result.add(y);
            }
        }
        System.out.println(result);
    }
}
