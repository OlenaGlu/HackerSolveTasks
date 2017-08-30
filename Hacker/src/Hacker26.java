import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by olenag on 8/9/2017.
 */
public class Hacker26 {



    public static void main (String[] args) throws ParseException {

        Scanner scan = new Scanner(System.in);
        int dayA = scan.nextInt();
        int monthA = scan.nextInt();
        int yearA = scan.nextInt();
        int dayE = scan.nextInt();
        int monthE = scan.nextInt();
        int yearE = scan.nextInt();
        scan.close();
        Calendar dateActual = new GregorianCalendar();
        dateActual.set(yearA, monthA, dayA);
        int fine = 0;

        if (yearA == yearE) {
            if (monthA > monthE) {
                fine = 500 * (monthA - monthE);
            } else if ((monthA == monthE) && (dayA > dayE)) {
                fine = 15 * (dayA - dayE);
            }
        } else if (yearA > yearE) {
            fine = 10000;
        }
        System.out.println(fine);
    }
}
