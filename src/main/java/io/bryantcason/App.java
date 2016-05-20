package io.bryantcason;


import static io.bryantcason.Prompt.*;
/**
 * Created by bryantcason on 5/19/16.
 */
public class App {

    public static void main(String[] args) {
        int number = askForInt("Enter a number: ");
        int sumOfNumbers = 0;

        for(int i = 0; i <= number; i++){
            sumOfNumbers += i;
        }

        System.out.println("Sum = " + sumOfNumbers);
    }
}
