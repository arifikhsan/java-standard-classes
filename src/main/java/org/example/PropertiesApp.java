package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        try {
            var properties = new Properties();
            properties.load(new FileInputStream("application.properties"));
            var name = properties.getProperty("name");
            System.out.println(name);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Gagal load data dari file");
        }
    }
}
