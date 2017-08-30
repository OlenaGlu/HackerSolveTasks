import java.util.Scanner;

/**
 * Created by olenag on 8/3/2017.
 */
public class Hacker11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int sumCheck = 0;
        int sumRes = Integer.MIN_VALUE;

        // 1 1 1
        // 0 1 0
        // 1 1 1
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sumCheck = arr[i][j] + arr [i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if (sumCheck > sumRes) {
                    sumRes = sumCheck;
                }
            }
        }
        System.out.println(sumRes);

    }

}