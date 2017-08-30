/**
 * Created by olenag on 7/9/2017.
 */
class Car {
    //import java.math.*;


    int MaxSpeed = 100;
    int MinSpeed = 0;
    double weight = 4079;
    boolean IsItOn = false;
    char condition = 'A';

    public void printVariables() {
        System.out.println("the max speed: " + MaxSpeed);

    }

    public static void main (String[] args){

        Car familyCar = new Car();
        familyCar.printVariables();



    }


}
