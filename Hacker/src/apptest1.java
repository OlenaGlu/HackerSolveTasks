import java.util.ArrayList;
import java.util.List;

/**
 * Created by olenag on 8/3/2017.
 */
public class apptest1 {

    private static int crazy_sum (int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = res + i * arr[i];
        }
        return res;
    }

    private static int square_nums (int max) {
        int res = 1;
        int resFinal = 1;
        for (int i=1;i < max;i++) {
            res = i * i;
            if (max > res) {
                resFinal = res;
            }

        }
        return resFinal;
    }

    private static Integer[] crazy_nums (int num) {
        List<Integer> list = new ArrayList<>();
        for (int i=3; i<num;i++){
            if (((i<num)&&(i%3==0)||(i<num)&&(i%5==0))&&(i%15!=0)) {
                list.add(i);
            }
        }
        System.out.println(list);
        return list.toArray(new Integer[0]);

    }


    public static void main(String[] args) {

        /*Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }*/

        //crazy_nums(20);
        square_nums(5);

        //System.out.println(crazy_sum(arr));
        System.out.println(5);
    }
}
