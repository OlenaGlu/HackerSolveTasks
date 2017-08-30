/**
 * Created by olenag on 8/2/2017.
 */

import java.util.Scanner;

public class Hacker6 {

    private static void stringChange(String str){

        int len = str.length();
        char[] stringChar = str.toCharArray();
        String newEven = "", newOdd = "";
        int i = 0;

        while (i < len){
            //char[] newEven = stringChar[i] =
            newEven = newEven + stringChar[i];
            i = i + 2;
        }

        i = 1;
        while (i <= len - 1){
            //char[] newEven = stringChar[i] =
            newOdd = newOdd + stringChar[i];
            i = i + 2;
        }

        System.out.println(newEven + " " + newOdd);

    }


    public static void main(String[] args){
        Scanner stIn = new Scanner(System.in);
        int rowCount = stIn.nextInt();
        for (int i = 0; i < rowCount; i++){
            stringChange(stIn.next());
        }
        stIn.close();
    }
}
