import java.util.Scanner;

/**
 * Created by olenag on 8/18/2017.
 */

/* my case:
* 4
1
0
2
3
0 1  2 3
2 0  3 7
4 10 0 1
2 3  4 0
*/

final class Result {
    private final double value;
    private final int position;

    public Result(double value, int position) {
        this.value = value;
        this.position = position;
    }

    public double getValue() {
        return value;
    }

    public int getPosition() {
        return position;
    }
}



public class Currencies {

    static Result maxInRow(int n, int row, int startCol, double[][] A) {

    return new Result(A[row][startCol], startCol);
    }

    static Result maxInColumn(int n, int column, double[][] A) {
        double value = 0;
        int positionClass = 0;
        for (int i = 0; i < n; i++) {
            if ((i != column) /*&& (startRow ==0)*/) {
                if (A[i][column] > value) {
                    value = A[i][column];
                    positionClass = i;
                }
            } /*else  if (startRow != 0) {
                value = A[startRow][column];
                positionClass = startRow;
            }*/
        }
        return new Result(value, positionClass);
    }

    static void currencies(int n, int x, int s, int f, int m, double[][] A) {
        // Complete this function
        double res = 1;
        Result cur;
        int startPosition = s;
        int finalPosition = f;
        for (int m0 = 0; m0 < m; m0++) {
            if (m0 == (m-1)) {
                startPosition = s;
                cur = maxInRow(n, startPosition, finalPosition, A);
                res = res * cur.getValue();
                finalPosition = cur.getPosition();
            } else {
                cur = maxInColumn(n, finalPosition, A);
                res = res * cur.getValue();
                finalPosition = cur.getPosition();
            }
        }
        res = res * x;

        System.out.println(res);
    }

    private static final long MOD = 1000000007L;

    private static long currencies2(int n, int x, int s, int f, int m, long[][] A, int c, int mc) {
        if (mc <= 0) {
            return x;
        }

        /*if (mc < m && c == s) {
            int cycleLength = m - mc;
            int numberOfFullCycles = m / cycleLength;
            long profitAfterOneCycle = x;
            for (int i = 0; i < numberOfFullCycles - (s == f ? 0 : 1); i++) {
                x = (int) ((((long) x) * profitAfterOneCycle) % MOD);
            }
            if (s == f) {
                return x;
            } else {
                mc = m % cycleLength == 0 ? cycleLength : m % cycleLength;
            }
        }*/

        long result = 0;
        if (mc == 1) {
            result = (((long) x) * A[c][f]) % MOD;
        } else {
            for (int i = 0; i < n; i++) {
                /*if (c == i) {
                    continue;
                }*/
                //result = Math.max(result, currencies2(n, (int) ((((long) x) * A[c][i]) % MOD), s, f, m, A, i, mc - 1));
                result = Math.max(result, currencies2(n, (int) (((long) x) * A[c][i]), s, f, m, A, i, mc - 1));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int s = in.nextInt();
        int f = in.nextInt();
        int m = in.nextInt();
        long[][] A = new long[n][n];
        for(int A_i = 0; A_i < n; A_i++){
            for(int A_j = 0; A_j < n; A_j++){
                A[A_i][A_j] = in.nextLong();
            }
        }
        in.close();
        System.out.println(currencies2(n, x, s, f, m, A, s, m));
    }


}
