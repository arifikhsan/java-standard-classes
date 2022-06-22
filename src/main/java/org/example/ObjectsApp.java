package org.example;

import java.util.Objects;

@SuppressWarnings("ALL")
public class ObjectsApp {
    public static void main(String[] args) {
        String name = null;
        System.out.println(Objects.toString(name)); // null
        System.out.println(Objects.hashCode(name)); // 0
    }
}
