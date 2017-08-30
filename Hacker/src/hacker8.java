import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by olenag on 8/3/2017.
 */
public class hacker8 {

    /*Map<String,String> myMap = new HashMap<String,String>();

// Adds ("Hi","Bye") mapping to myMap
myMap.put("Hi", "Bye");

// Print the Value mapped to from "Hi"
System.out.println(myMap.get("Hi"));

// Replaces "Bye" mapping from "Hi" with "Bye!"
myMap.put("Hi", "Bye!");

// Print the Value mapped to from "Hi"
System.out.println(myMap.get("Hi"));*/

    //Complete this code or write your own from scratch


        public static void main(String []argh){
            Map<String, Integer> myMap = new HashMap<String, Integer>();
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for(int i = 0; i < n; i++){
                String name = in.next();
                int phone = in.nextInt();
                // Write code here
                    myMap.put(name, phone);

            }
            while(in.hasNext()){
                String s = in.next();
                // Write code here
                if (myMap.containsKey(s)) {
                    System.out.println(s + "=" + myMap.get(s));
                }
                else{
                    System.out.println("Not found");
                }
            }
            in.close();
        }


}
