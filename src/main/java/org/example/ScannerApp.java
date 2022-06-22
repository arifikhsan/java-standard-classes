package org.example;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        var name = scanner.nextLine();

        System.out.print("Enter your age: ");
        var age = scanner.nextInt();

        System.out.println("Hello, " + name);
        System.out.println("You are " + age + " years old.");
    }
}
