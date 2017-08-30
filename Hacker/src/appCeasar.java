import java.util.Scanner;

/**
 * Created by olenag on 8/3/2017.
 */
public class appCeasar {

    private static void Ceasar (int shift, String s) {
        char[] arr = s.toCharArray();
        char[] arrRes = new char[s.length()];
        for (int i=0; i<s.length();i++) {
           int ascii = (int)arr[i];
           ascii = ascii + shift;
           if (ascii > 122) {
                ascii = ascii - 26;
            }
           arrRes[i] = (char)ascii;
        }
        String res = new String (arrRes);
        System.out.println(res);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.nextLine();
        Ceasar(n,s);
    }
}
