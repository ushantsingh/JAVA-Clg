//  largest length of words --> powerful

public class check_noOf_Words_powerful {
    public static void main(String[] args) {
        int max = 0;
        String str = "java is powerful";
        String a[] = str.split(" ");
        String largest = "";
        for (String element : a) {
            if (element.length() > largest.length()) {
                largest = element;
            }
        }
        System.out.println("Largest word is : "+largest);
    }
}
