package se.atchIT.Application;

import java.util.Scanner;

public class ConsoleMenus {

    Scanner readIn = new Scanner(System.in);

    //Print the first page that showes once the app is running.
    public void printFirstPage() {

        System.out.println("+----------------------------------------------+");
        System.out.println("|            Welcome to KNA bus company        |");
        System.out.println("+----------------------------------------------+");

        System.out.println("1)Add a tour.");
        System.out.println("2)Add a Customer.");
        System.out.println("3)Search for trip.");
        System.out.println("4)Book a trip.");
        System.out.println("5)Add a trip.");
        System.out.println("0)Exit.");


    }


    //Get the user choice after printing a msg and return it to a variable when it is needed
    public int readUserChoice() {
        System.out.println("Enter your choice Here:");
        int choice = readIn.nextInt();

        return choice;
    }



}
