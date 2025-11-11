// aabbcab --> a2b2c1a1b1

public class Question2 {
    public static void main(String[] args) {
        int count = 1;
        String str = "aabbcab";

        StringBuilder result = new StringBuilder();
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result.append(str.charAt(i-1)).append(count);
                count = 1;
            }
        }
        result.append(str.charAt(str.length() - 1)).append(count);
        System.out.println(result);

        // StringBuilder result = new StringBuilder();
        // int n = str.length();
        // for (int i = 0; i < n; ) {
        //     char c = str.charAt(i);
        //     int count = 0;
        //     while (i < n && str.charAt(i) == c) {
        //         count++;
        //         i++;
        //     }
        //     result.append(c).append(count);
        // }
        // System.out.println(result.toString());
    }
}
