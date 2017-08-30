import java.util.Scanner;

/**
 * Created by olenag on 8/4/2017.
 */
public class Hacker12 {


    static class Student extends Person{
        private int[] testScores;
        char calc;

        /*
        *   Class Constructor
        *
        *   @param firstName - A string denoting the Person's first name.
        *   @param lastName - A string denoting the Person's last name.
        *   @param id - An integer denoting the Person's ID number.
        *   @param scores - An array of integers denoting the Person's test scores.
        */
        // Write your constructor here
        Student(String firstName, String lastName, int identification, int[] scores){
            super(firstName, lastName, identification);
            this.testScores = scores;
        }

        //Student

        /*
        *   Method Name: calculate
        *   @return A character denoting the grade.
        */
        // Write your method here
        public char calculate(){
            int amount = 0;
            char res;
            for (int i = 0; i < testScores.length; i++){
                amount = amount + testScores[i];
            }
            amount = amount / testScores.length;

            if ((90<=amount)&&(amount<=100)){
                res = 'O';
            } else if ((80<=amount)&&(amount<90)){
                res = 'E';
            } else if ((70<=amount)&&(amount<80)){
                res = 'A';
            } else if ((55<=amount)&&(amount<70)){
                res = 'P';
            } else if ((40<=amount)&&(amount<55)) {
                res = 'D';
            } else if (amount<40) {
                res = 'T';
            } else {
                res = '1';
            }
            calc = res;
            return calc;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
