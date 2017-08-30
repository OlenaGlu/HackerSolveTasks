import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by olenag on 8/11/2017.
 */
public class Stat11 {
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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();

        int[] ar = new int[q];
        for (int i = 0; i < q; i++) {
            ar[i] = in.nextInt();
        }

        Arrays.sort(ar);
        int newl = q/2;

        int[] arQ1 = new int[newl];
        for (int i = 0; i < newl; i++) {
            arQ1[i] = ar[i];
        }

        int[] arQ3 = new int[newl];
        for (int i = 0; i < newl; i++) {
            arQ3[i] = ar[i + newl + q%2];
        }

        median(arQ1);
        median(ar);
        median(arQ3);

        in.close();
    }


}
