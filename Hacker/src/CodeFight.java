import java.util.Scanner;

/**
 * Created by olenag on 7/12/2017.
 */
public class CodeFight {

    public static int checkString(String s, char c){
        int countChar = 0;

        for (int i = 0; i < s.length(); i ++){
            if (s.charAt(i) == c) {
                countChar = countChar + 1;
            }
        }
        return countChar;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.next();
        in.close();

        boolean checkPalindrome = true;
        //String inputString = "abbaba";
        int n = inputString.length();
        int midn = Math.round(n/2);
        //System.out.println(n);
        int lineAr[] = new int[n];
        for (int i = 0; i < midn; i++){
            //char c1 = (char) inputString.charAt(i);
            //char c2 = (char) inputString.charAt(n-i-1);
            if (inputString.charAt(i) != inputString.charAt(n - i - 1)){
                checkPalindrome = false;
            }

        }

        if (checkPalindrome) {
            System.out.println("yes");
        }
        else {System.out.println("no");}

        int ss;
        ss = checkString(inputString, 'a');

        System.out.println("count of a = " + ss);


    }
}
