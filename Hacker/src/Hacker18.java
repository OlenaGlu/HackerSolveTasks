import java.util.Scanner;

/**
 * Created by olenag on 8/6/2017.
 */

public class Hacker18 {

    static class Calculator {
        //Calculator newEx = new ()
        void newException() throws Exception{
            throw new Exception("n and p should be non-negative");
        }

        int power(int n,int p) throws Exception {
            int res = 0;
            if ((n < 0)||(p < 0)) {
                newException();
            }
            else {
                res = (int)Math.pow((double)n, (double)p);
            }
            return res;
        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }

}
