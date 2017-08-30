import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by olenag on 8/14/2017.
 */
public class Stat13 {
//** Day 1: Standard Deviation

    private static double median (int[] ar) {
        double res;
        int n = ar.length / 2;
        if (ar.length%2==0){
            res = (double)((ar[n-1] + ar[n])) / 2;
        } else {
            res = (double)ar[n];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int justsum = 0;
        int[] ar = new int[q];
        for (int i = 0; i < q; i++) {
            ar[i] = in.nextInt();
            justsum = justsum + ar[i];
        }

        //Arrays.sort(ar);

        double m = (double)justsum/q; //median(ar);
        BigDecimal sum = BigDecimal.ZERO;
        for (int i = 0; i < q; i++) {
            BigDecimal sumCur = BigDecimal.ZERO;
            sumCur = BigDecimal.valueOf(ar[i]-m);
            sumCur = sumCur.pow(2);
            sum = sum.add(sumCur);
        }
        sum = sum.divide(BigDecimal.valueOf(q));
        float res = (float)Math.sqrt(sum.floatValue());
        System.out.printf("%.1f", res);
    }

}

