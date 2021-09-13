/*
*  UCF COP3330 Fall 2021 Assignment 1 Solution
*  Copyright 2021 Victor Urena
*/

import java.util.Scanner;

class Main {
    public static void main( String args[] ) {
       Scanner input = new Scanner(System.in);//creating scanner

       //prompts user to enter input string
       System.out.print("What is the quote? ");
       String quote = input.nextLine();

       System.out.print("Who said it? ");
       String author = input.nextLine();

       System.out.println(author + " says " + "\"" + quote + "\"");
       }
}