import java.util.Scanner;

/**
 * Created by olenag on 8/8/2017.
 */
public class WarmUpDiagonalDif {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int mainSum = 0;
        int oppositSum = 0;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
                if (a_i == a_j) {
                    mainSum = mainSum + a[a_i][a_j];
                }
                if ( (a_i + a_j) == n - 1) {
                    oppositSum = oppositSum + a[a_i][a_j];
                }
            }
        }
        System.out.println(Math.abs(mainSum - oppositSum));
    }

}
