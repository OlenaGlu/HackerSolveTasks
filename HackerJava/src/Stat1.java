import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by olenag on 8/9/2017.
 *
 * Stat 0 day
 */
public class Stat1 {

    private static void median (int[] ar) {
        float res;
        int n = ar.length / 2;
        if (ar.length%2==0){
            res = (float)((ar[n-1] + ar[n])) / 2;
        } else {
            res = (float)ar[n];
        }
        System.out.printf("%.1f", res);
        System.out.println();
    }

    private static void mean (int sum, int k) {
        float res;
        res = (float)sum/k;
        System.out.printf("%.1f", res);
        System.out.println();
    }

    private static void mode (int[] ar) {
        int res = 0;
        int sampleRes = 0;
        for (int j = 0; j < ar.length; j++) {
            int sample = ar[j];
            int k = 0;
            for (int i = 0; i < ar.length; i++) {
                if (ar[i] == sample) {
                    k++;
                }
                if (k > res) {res = k;
                sampleRes = sample;}
            }
        }
        System.out.println(sampleRes);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int[] ar = new int[q];
        int sum = 0;
        for (int i = 0; i < q; i++) {
            ar[i] = in.nextInt();
            sum = sum + ar[i];
        }
        Arrays.sort(ar);
        mean(sum, q);
        median(ar);
        mode(ar);
        in.close();
    }
}
