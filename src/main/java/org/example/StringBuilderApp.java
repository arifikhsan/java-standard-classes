package org.example;

@SuppressWarnings("ALL")
public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Arif");
        builder.append(" ");
        builder.append("Ikhsan");
        builder.append(" ");
        builder.append("Udin");

        var name = builder.toString();
        System.out.println(name);
    }
}
