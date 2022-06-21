package org.example;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        StringTokenizer tokenizer = new StringTokenizer("Arif Ikhsan Udin", " ");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
