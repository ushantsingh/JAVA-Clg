import java.util.HashMap;

public class Hasmap {
    public static void main(String[] args) {
        String str="aabcad";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);

        for (char ch : str.toCharArray()) {
            if (map.get(ch)==1) {
                System.out.println(ch);
                break;
            }
        }
        
        
        
        
        // HashMap<Integer, Integer> map = new HashMap<>();
        // int arr[] = { 2, 2, 3, 4, 2, 4 };
        // for (int x : arr) {
        //     map.put(x,map.getOrDefault(x, 0)+1);
        // }
        // System.out.println(map);

    //     map.put(1, 10);
    //     map.put(2  , 20);
    //     System.out.println(map);
    //     // System.out.println(map.get(1));
    //     // System.out.println(map.getOrDefault(11, 50));
    //     for(int x: map.keySet()){
    //         System.out.println(map.get(x));
    //     }
    }
}
