import java.util.Scanner;

/**
 * Created by olenag on 8/7/2017.
 */
public class First101 {

        static long howManyToInvite(long A, long B, long a) {
            // Return the number of people Leha should invite to his party
            float check;
            check = (float) (a * B) / A;
            int test = (int)check;
            if (test < check) {
                check = 0;
            }
            return (long)check;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            long A = in.nextLong();
            long B = in.nextLong();
            long a = in.nextLong();
            long b = howManyToInvite(A, B, a);
            System.out.println(b);
            in.close();
        }


}
