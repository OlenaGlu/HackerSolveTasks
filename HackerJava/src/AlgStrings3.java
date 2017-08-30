import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by olenag on 8/10/2017.
 */


public class AlgStrings3 {
    public char[] resChar = this.resChar;

    private static boolean checkStr (char[] arr) {
        boolean res = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i+1]) {
                res = false;
            }
        }
        return res;
    }

    private static char[] deleteExtraChar (char[] arr, char a) {
        String s = "";
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != a) {
                s = s + arr[i];
            }
        }
        char[] res = s.toCharArray();

        //System.out.println(s);
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        //LinkedList<Character[]> charS = new LinkedList<>();
        char[] charAr = s.toCharArray();

        int controlL = 0;
        char[] charCur = charAr.clone();
        if (charAr.length <=1) {
            System.out.println(0);
        } else if ((charAr.length == 2) && (charAr[0] != charAr[1])) {
            System.out.println(1);
        } else {
            for (int i = 0; i < charAr.length; i++) {
                    charCur = deleteExtraChar(charAr, charAr[i]);
                if (checkStr(charCur) && controlL < charCur.length) {
                    controlL = charCur.length;
                }
            }
            System.out.println(controlL);
        }




    }




}
