package io.bryantcason;

import java.util.Scanner;

/**
 * Created by bryantcason on 5/19/16.
 */
public class Prompt {
    static Scanner input = new Scanner(System.in);

    public static void message(String message){
        System.out.println(message);
    }

    public static int askForInt(String message){
        message(message);
        return input.nextInt();
    }
}
