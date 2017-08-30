import java.util.Scanner;


/**
 * Created by olenag on 8/9/2017.
 */
public class WarmCats {

    private static void catWin (int x, int y, int z) {
        int catA = Math.abs(x-z);
        int catB = Math.abs(y-z);
        String s;
        if (catA == catB) {
            s = "Mouse C";
        } else if (catA < catB) {
            s = "Cat A";
        } else {
            s = "Cat B";
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            catWin (x, y, z);
        }
        in.close();
    }
}
