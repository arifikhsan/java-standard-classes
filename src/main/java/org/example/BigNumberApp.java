package org.example;

import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("12345678901234567890");
        BigInteger b = new BigInteger("12345678901234567890");
        System.out.println(a);

        BigInteger c = a.add(b);
        System.out.println(c);
    }
}
