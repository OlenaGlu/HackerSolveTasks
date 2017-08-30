import java.util.Scanner;

/**
 * Created by olenag on 8/8/2017.
 */
interface AdvancedArithmetic{
    int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
    private static int n;
    private static int sum;
    public Calculator () {
        this.n = n;
        this.sum = sum;
    }

    public int divisorSum(int n) {
        sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n%i == 0) {
                sum = sum + i;
            }

        }
        return sum;
    }

}
public class Hacker19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }

}
