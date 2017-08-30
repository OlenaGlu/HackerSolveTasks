import java.util.Scanner;

/**
 * Created by olenag on 8/18/2017.
 */
// pass
public class BankAccount {
    static String feeOrUpfront(int n, int k, int x, int d, int[] p) {
        // Complete this function
        String res;
        float fee = 0;
        float fix = (float)d;

        for (int i = 0; i < n; i++) {
            float curRes = (float)(p[i] * x) / 100;
            fee = fee + Math.max( curRes, (float)k);
        }

        if (fix < fee) {
            res = "upfront";
        } else {
            res = "fee";
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int x = in.nextInt();
            int d = in.nextInt();
            int[] p = new int[n];
            for(int p_i = 0; p_i < n; p_i++){
                p[p_i] = in.nextInt();
            }
            String result = feeOrUpfront(n, k, x, d, p);
            System.out.println(result);
        }
        in.close();
    }
}


