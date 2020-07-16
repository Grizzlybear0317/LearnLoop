package basic;

import java.util.Scanner;

public class LearnLoop {

    //For Loop
    //while Loop
    //Do While Loop
    //For Each Loop

    void myPeramid() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number of rows");
        int numOfRow = input.nextInt();

        for (int i = 1; i <= numOfRow; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    void myPeraWhile() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number of rows");
        int numOfRow = input.nextInt();
        int i = 1;

        while (i <= numOfRow) {
            int j = 1;
            while (j <= i) {

                System.out.print(j + " ");
                j++;

            }
            System.out.println(" ");
            i++;


        }

    }

    void doWhile() {
        int i = 1;
        do {
            System.out.println("this mu do while loop");

            i++;
        } while (i <= 3);
        System.out.println(("Do while Loop Ended"));

    }

    void myWhile() {
        int i = 1;

        while (i <= 3) {
            System.out.println("My While Loop is Running");
            i++;
        }
        System.out.println("My While Loop Ended");
    }

    void myForLoop() {
        int i;
        for (i = 1; (i <= 3 && i < 5); i++) {
            System.out.println("My For Loop is Running");
        }
        System.out.println("For Loop Ended");
    }

    public static void main(String[] args) {
        LearnLoop obj = new LearnLoop();
        //obj.myForLoop();
        //obj.myWhile();
        // obj.doWhile();
        //obj.myPeramid();
        obj.myPeraWhile();


    }
}
