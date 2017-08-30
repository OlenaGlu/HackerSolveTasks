import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by olenag on 8/7/2017.
 */
public class Second2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[m];
        int[] arrVage = new int[m];
        for(int a0 = 0; a0 < m; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            if (y>=x) {
                arr[a0] = x + y;
            } else if ((y==0) && (x>0)) {
                arr[a0] =  3*m + (m - x);
            } else if ((x==m) &&(y>0)) {
                arr[a0] = (2 * m - y) + x;
            }
        }
        //System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        for (int i = 0; i < m; i++) {
            if ((i+1) < m) {
                arrVage[i] = arr[i + 1] - arr[i];
            } else {
                arrVage[i] = ((m * 4) - arr[i]) + arr[0];
            }
        }
        System.out.println(Arrays.toString(arrVage));
        LinkedList<Integer> list = new LinkedList(Arrays.asList(arrVage));


        int res = 0;
        int midRes = Integer.MAX_VALUE;
        if (k==1) {
            res = 0;
        } else  {
            for (int i = 0; i < m; i++) {
                for (int j = i; j < k + i - 1; j++) {
                    if (j < m) {
                        res = res + arrVage[j];
                    } else {
                        res = res + arrVage[j - m];
                    }
                }
                if (midRes > res) {
                    midRes = res;
                }

            }
        }
        System.out.println(midRes);
        // Write Your Code Here
        in.close();
    }

}
