/*Row-wise Sum (Har row ka sum print karo) */


public class Question_3 {
    public static void main(String[] args) {
        int rowSum = 0;
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                rowSum += arr[i][j];
            }
            System.out.println("Sum of Row " + i + " : " + rowSum);
            rowSum = 0;
        }
    }
}
