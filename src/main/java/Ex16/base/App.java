/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xander Wilhelm
 */

package Ex16.base;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        int age = myApp.getAge();
        String output = (age >= 16) ? "You are old enough to legally drive." : "You are old not enough to legally drive.";
        myApp.display(output);
    }

    private void display(String output) {
        System.out.println(output);
    }

    private int getAge() {
        System.out.print("What is your age? ");
        return Integer.parseInt(in.nextLine());
    }

}
