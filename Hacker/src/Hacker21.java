import java.util.Scanner;

/**
 * Created by olenag on 8/8/2017.
 */
class Printer <T> {
    /**
     *    Method Name: printArray
     *    Print each element of the generic array on a new line. Do not return anything.
     *    @param A generic array
     **/

    // Write your code here
    /*private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }

    //Printer (){

    //}

    public void printArray (Printer<T> array) {
        java.util.List<Printer<T>> res1 = new Printer<>();
        t = res;
        res.set();   //.set(t);
        res1.add(res); //add(res1);

        //t = (T)res;
        for (Printer<T> printRes: res) {
            T resContext = printRes.get();
            System.out.println(printRes.toString());
            //counter++;
        }

    }*/

    public void printArray (T[] A) {
        for (T t : A) {
            System.out.println(t);
        }
    }
}

public class Hacker21 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }

        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        intPrinter.printArray( intArray  );
        stringPrinter.printArray( stringArray );
        if(Printer.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    }

}
