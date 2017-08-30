import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by olenag on 8/18/2017.
 */
// need update to situation whet you skip first day
public class BuyMaximumStocks {

    static int maxPossible(long less, int price, int count) {
        int res = 0;
            if (count * price > less) {
                count--;
                return  res = maxPossible(less, price, count);
            } else {
                res = count;
                return res;
            }
    }

    static long buyMaximumProducts(int n, long k, int[] a) {
        // Complete this function
        int max = 0;
        int min = Integer.MAX_VALUE;
        int simpleSum = 0;
        long count = 0;
        long less = k;
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
            if ((a[i] * (i + 1)) < less) {
                simpleSum = simpleSum + a[i] * (i + 1);
                less = less - (a[i] * (i + 1));
                count = count + i + 1;
            } else {
                int c = maxPossible(less, a[i], (i+1));
                less = less - (a[i] * c);
                count = count + c;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        long k = in.nextLong();
        long result = buyMaximumProducts(n, k, arr);
        System.out.println(result);
        in.close();
    }

}
