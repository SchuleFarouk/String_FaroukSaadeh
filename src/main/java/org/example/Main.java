package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Aufgabe 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie ihren Namen ein:");
        String firstname = scanner.nextLine();
        System.out.println("Geben Sie ihren Nickname ein:");
        String nickname = scanner.nextLine();

        String fullname = firstname.concat(nickname);
        System.out.println(fullname);
        System.out.println(fullname.toUpperCase());


    }
}