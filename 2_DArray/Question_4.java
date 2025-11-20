/*Column-wise Sum (Har column ka sum print karo) */
public class Question_4 {
    public static void main(String[] args) {
        int colSum = 0;
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                colSum += arr[i][j];
            }
            System.out.println("Sum of Column " + j + " : " + colSum);
            colSum = 0;
        }   
    }
}