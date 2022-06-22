package org.example;

public class RuntimeApp {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total memory: " + runtime.totalMemory());
        System.out.println("Free memory: " + runtime.freeMemory());
        System.out.println("Max memory: " + runtime.maxMemory());
        System.out.println("Available processor: " + runtime.availableProcessors());
    }
}
