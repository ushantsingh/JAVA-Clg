// Minimum Element (Matrix ka sabse chhota element find karo)

public class Question_6 {
    public static void main(String[] args) {
        int min = 6;
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println(min);
    }
}
