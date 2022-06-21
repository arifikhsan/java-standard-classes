package org.example;

@SuppressWarnings("ALL")
public class StringApp {
    public static void main(String[] args) {
        String name = "Arif Ikhsan Udin";
        System.out.println(name);

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.startsWith("Arif"));
        System.out.println(name.endsWith("Udin"));

        String[] names = name.split(" ");
        for (String n : names) {
            System.out.println(n);
        }

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(name.charAt(0));

        char[] chars = name.toCharArray();
        System.out.println(chars);
    }
}
