import java.util.Scanner;

/**
 * Created by olenag on 8/2/2017.
 */
public class Hacker7 {

    private static boolean almostIncreasingSequence(int[] sequence) {
        boolean res = false;
        //int[] cur = new int[sequence.length - 1];
        //int[] curSort = new int[sequence.length - 1];
        //int k = 1;
        int count = 0;
        for (int i = 0; i < sequence.length; i++){
            int n = i;
            boolean flag = false;
            for (int j = 0; j < sequence.length - 1; j++) {
                if (j == n - 1) {
                    if (sequence[j] >= sequence[j + 1]) {

                    }
                } else if (j == n + 1) {

                } else if (j == n) {

                } else {

                }





















                int k = j+1;






                if (((j+1) == n) && (n == sequence.length)) {
                    k++;
                }
                if ((j != n) && ((j + 1) != n)) {
                    if (sequence[j] >= sequence[j + 1]) {
                        flag = true;
                        break;
                    }
                } else if ((j + 1) == n) {
                    if (sequence[j] >= sequence[j + 2]) {
                        flag = true;
                        break;
                    }
                }
            }
            if (flag == true) {
                res = false;
            } else {
                res = true;
                break;
            }
        }


        //List<Integer> sequenceList = Arrays.asList(sequence);
        //Set<Integer> =

        /*for (int i = 0; i < sequence.length; i++) {
            int k = 0;
            for (int j = 0; j < sequence.length;  j++) {
                if (j != i) {
                    cur[k] = sequence[j];
                    curSort[k] = sequence[j];
                    k++;
                }
            }
            Arrays.sort(curSort);

            if (Arrays.equals(cur, curSort)) {
                res = true;
                for (int j = 0; j < curSort.length - 1;  j++) {
                    if (curSort[j] == curSort[j + 1]) {
                        res = false;
                    }
                }
            }
        }*/
        return res;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        //boolean s = al
        System.out.println(almostIncreasingSequence(arr));


        for (int i=0; i < n; i++){
            if (i < n - 1) {
                System.out.print(arr[n - i - 1] + " ");
            }
            else {
                System.out.print(arr[n - i - 1]);
            }
        }

    }
}
