import java.util.*;
public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a string :");
        // String str = sc.nextLine();
        // System.out.println(str);

        int arr[] = { 1, 2, 3, 45 ,7,3,3,344};
        System.out.println(arr[0]);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Arrray is :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
