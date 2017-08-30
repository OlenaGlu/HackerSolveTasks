import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by olenag on 8/9/2017.
 */
public class WarmTriplets {
    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        // Complete this function
        int[] res = new int[2];
        res[0] = 0;
        res[1] = 0;
        res[1] = ((a0<b0) ? 1 : 0);
        res[1] = res[1] + ((a1<b1) ? 1 : 0);
        res[1] = res[1] + ((a2<b2) ? 1 : 0);
        res[0] = ((b0<a0) ? 1 : 0);
        res[0] = res[0] + ((b1<a1) ? 1 : 0);
        res[0] = res[0] + ((b2<a2) ? 1 : 0);

        return res;
    }

    static long aVeryBigSum(int n, long[] ar) {
        // Complete this function
        BigInteger sum = BigInteger.valueOf(0);
        for (int i = 0; i < n; i++) {
            sum = sum.add(BigInteger.valueOf(ar[i]));
        }
        return sum.longValue();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] ar = new long[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextLong();
        }
        long result = aVeryBigSum(n, ar);
        System.out.println(result);
    }
}
