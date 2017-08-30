import java.util.*;

/**
 * Created by olenag on 8/14/2017.
 */
public class Stat12 {

    private static float median (LinkedList<Integer> ar) {
        float res;
        int n = ar.size() / 2;
        if (ar.size()%2==0){
            res = (float)((ar.get(n-1) + ar.get(n)) / 2);
        } else {
            res = (float)ar.get(n);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();

        int[] ar = new int[q];
        for (int i = 0; i < q; i++) {
            ar[i] = in.nextInt();
        }

        int[] arF = new int[q];
        for (int i = 0; i < q; i++) {
            arF[i] = in.nextInt();
        }
        LinkedList<Integer>  listQ = new LinkedList<Integer>();
        for (int i = 0; i < q; i++) {
            int k = arF[i];
            while (k>0) {
                listQ.add(ar[i]);
                k--;
            }
        }
        Collections.sort(listQ);
        q = listQ.size();
        int newl = q/2;
        int k = 1;

        LinkedList<Integer>  listQ1 = new LinkedList<Integer>();
        LinkedList<Integer>  listQ3 = new LinkedList<Integer>();

        while (k <= newl) {
            listQ1.add(listQ.removeFirst());
            k++;
        }

        if (q%2 != 0) {
            listQ.remove(1);
        }
        k = 1;
        while (k <= newl) {
            listQ3.add(listQ.removeFirst());
            k++;
        }

        System.out.printf("%.1f", median(listQ3)-median(listQ1));

        in.close();

    }
}
