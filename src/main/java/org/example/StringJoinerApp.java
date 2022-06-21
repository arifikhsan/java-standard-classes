package org.example;

import java.util.StringJoiner;

@SuppressWarnings("ALL")
public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(",", "[", "]");
        joiner.add("Arif").add("Ikhsan").add("Udin");

        var name = joiner.toString();
        System.out.println(name);
    }
}
