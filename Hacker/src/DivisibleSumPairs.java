import java.util.Scanner;

/**
 * Created by olenag on 8/10/2017.
 */
public class DivisibleSumPairs {
    static int divisibleSumPairs(int n, int k, int[] ar) {
        // Complete this function
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    int sum = ar[i] + ar[j];
                    if (sum%k==0) {
                        res++;
                    }
                    sum = 0;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }

}
