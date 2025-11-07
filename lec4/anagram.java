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
        // System.out.println("Frequency 1 ");
        // for (int i = 0; i < 256; i++) {
        //     if (freq[i] > 0) {
        //         System.out.println((char) i + "-->" + freq[i]);
        //     }
        // }
        // System.out.println("Frequency 2 ");
        // for (int i = 0; i < 256; i++) {
        //     if (freq2[i] > 0) {
        //         System.out.println((char) i + "-->" + freq2[i]);
        //     }
        // }
        if (str.length() == str2.length() && Arrays.equals(freq, freq2)) {
            System.out.println("Both are anagram");
        }
        else {
            System.out.println("both are not anagram");
        }
    }
}
