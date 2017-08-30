import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeSeriesQueries {

    private static int typeOne(int[] time, int[] price, int val) {
        int n = price.length;
        int res = -1;
        for (int i = 0; i < n; i++) {
            if (price[i] >= val) {
                res = time[i];
                break;
            }
        }
        return res;
    }

    private static int typeTwo (int[] time, int[] price, int val) {
        int n = price.length;
        int res = -1;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (time[i] >= val) {
                max = Math.max(price[i], max);
                res = max;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        int[] t = new int[n];
        for(int t_i = 0; t_i < n; t_i++){
            t[t_i] = in.nextInt();
        }
        int[] p = new int[n];
        for(int p_i = 0; p_i < n; p_i++){
            p[p_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < q; a0++){
            int _type = in.nextInt();
            int v = in.nextInt();
            if (_type == 1) {
                System.out.println(typeOne(t, p, v));
            } else {
                System.out.println(typeTwo(t, p, v));
            }
        }
        in.close();
    }
}
