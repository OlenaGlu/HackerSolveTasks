/**
 * Created by olenag on 7/11/2017.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    //import java.math.*;

     /* code for another task. works.
        int PlusCount = 0;
        int MinusCount = 0;
        int ZeroCount = 0;
        double res;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        in.close();
        System.out.println(n);
        for(int arr_i=0; arr_i < n; arr_i++){
            if (arr[arr_i] < 0) {MinusCount = MinusCount + 1;}
            else if (arr[arr_i] > 0){PlusCount++;}
                 else {ZeroCount++;}
        }
        CalcAndRound(n, PlusCount);
        CalcAndRound(n, MinusCount);
        CalcAndRound(n, ZeroCount);*/

    private static void CalcAndRound(int n, int ArrPart){
        double res = 0.0;
        //res.setPrecision(6);
        //res = round(ArrPart * 1000000 / n) ;
        double newArrPart = (double) ArrPart;
        res = newArrPart / n;
        //System.out.println(res);
        //DecimalFormat df = new DecimalFormat("#.######");
        //df.setRoundingMode(RoundingMode.CEILING);
        //res =
        //System.out.println(
        //df.format(res / 1000000);
        //String s = String.valueOf(res);
        //System.out.printf("%.6f", Double.parseDouble(s));
        System.out.printf("%.6f", res);
        System.out.println();

    }

    public static void main(String[] args) {
        int totalSum = 0;
        int minElement;

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n%2==1){
            int countMedian = 2; // median elements count
        }
        else {
            int countMedian = 1;
        }
        int nCheck = n / 2; // middle of array

        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            totalSum = totalSum + arr[arr_i];
        }
        in.close();
        double arrMean = (double) totalSum / n;
        minElement = arr[0];
        int sameElement = arr[0];
        int countSameElements = 1;

        Arrays.sort(arr);

        for (int arr_i = 0; arr_i < n - 1; arr_i++){
            if (arr[arr_i] == arr[arr_i+1]){
                sameElement = arr[arr_i];
                countSameElements = countSameElements + 1;

            }
        }



    }


}
