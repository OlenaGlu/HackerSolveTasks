import java.util.Scanner;

/**
 * Created by olenag on 8/3/2017.
 */
public class Hacker10 {

    private static int calcOnes(String s) {
        int n = 0;
        int res = 0;
        char[] cOne = s.toCharArray();
        int len = cOne.length;

        for (int i = 0; i < len; i++ ){
            if (cOne[i] == '1') {
                n++;
            }
            else {
                if (n > res) {
                    res = n;
                }
                n = 0;
            }

        }

        if (res < n){
            res = n;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String res = Integer.toBinaryString(n);
        System.out.println(calcOnes(res));

    }


}
