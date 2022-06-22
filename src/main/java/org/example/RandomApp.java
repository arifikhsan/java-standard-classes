package org.example;

import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {
        var random = new Random();

//        var randomInt = random.nextInt();
        for (int i = 0; i < 1000; i++) {
            // max is exclusive
            System.out.println(random.nextInt(1000));
        }
    }
}
