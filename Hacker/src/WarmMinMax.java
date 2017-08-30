import java.util.Scanner;

/**
 * Created by olenag on 8/10/2017.
 */
public class WarmMinMax {

    private static long maxSum (int[] ar) {
        long res = 0;
        int min0 = Integer.MAX_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < min0) {
                min0 = ar[i];
            }
            res = res + ar[i];
        }
        return (res - min0);
    }

    private static long minSum(int[] ar) {
        int max0 = 0;
        long res = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max0) {
                max0 = ar[i];
            }
            res = res + ar[i];
        }
        return (res - max0);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        System.out.println(minSum(arr) + " " + maxSum(arr));

    }

}
