import java.util.Scanner;

/**
 * Created by olenag on 8/9/2017.
 */
public class Hacker25 {

    private static void checkPrime (int a) {
        String s = "Prime";
        int n = (int)Math.sqrt(a);
        if (a==1) {
            s = "Not prime";
        } else if ((a<=3)||(a==5)||(a==7)) {
            s = "Prime";
        } else if ((a%2 == 0)||(a%3 == 0)||(a%5 == 0)) {
            s = "Not prime";
        } else {

            for (int i = 2; i <= n; i++) {
                if (a%i==0) {
                    s = "Not prime";
                    break;
                }
                else {
                    s = "Prime";
                }
            }
        }
        System.out.println(s);
    }

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            checkPrime(scan.nextInt());
        }
        scan.close();
    }
}
