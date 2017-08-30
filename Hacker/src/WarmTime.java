import java.util.Scanner;

/**
 * Created by olenag on 8/9/2017.
 */
public class WarmTime {
    static String timeConversion(String s) {
        // Complete this function
        String[] cur = s.split(":");
        String res;
        String checkTime = cur[2].substring(2,4);
        cur[2] = cur[2].substring(0,2);
        if (checkTime.equals("PM")) {
            if (!cur[0].equals("12")) {
                int hh = Integer.parseInt(cur[0]);
                hh = hh + 12;
                cur[0] = Integer.toString(hh);
            }
        } else {
            if (cur[0].equals("12")) {
                cur[0] = "00";
            }
        }
        return res = String.join(":",cur);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }

}
