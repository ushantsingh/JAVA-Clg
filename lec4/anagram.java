import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String str = "hello";
        String str2 = "hlloe";
        int freq[] = new int[256];
        int freq2[] = new int[256];
        for (int ch : str.toCharArray()) {
            freq[ch]++;
        }
        for (int ch2 : str2.toCharArray()) {
            freq2[ch2]++;
        }
        if (str.length() == str2.length() && Arrays.equals(freq, freq2)) {
            System.out.println("Both are anagram");
        }
        else {
            System.out.println("both are not anagram");
        }
    }
}
