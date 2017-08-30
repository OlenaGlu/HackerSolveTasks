import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by olenag on 8/11/2017.
 */

public class Stat02 {


    private static void mean (int sum, int k) {
        float res;
        res = (float)sum/k;
        System.out.printf("%.1f", res);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int[] arElements = new int[q];
        int[] arVage = new int[q];
        int[] arVagesElements = new int[q];
        int sum = 0;
        int sumVages = 0;
        for (int i = 0; i < q; i++) {
            arElements[i] = in.nextInt();
        }

        for (int i = 0; i < q; i++) {
            arVage[i] = in.nextInt();
            arVagesElements[i] = arVage[i] * arElements[i];
            sum = sum + arVage[i];
            sumVages = sumVages + arVagesElements[i];
        }
        mean(sumVages, sum);
        in.close();
    }


}
