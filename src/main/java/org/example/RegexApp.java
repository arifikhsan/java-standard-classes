package org.example;

import java.util.regex.Pattern;

public class RegexApp {
    public static void main(String[] args) {
        var name = "Eko Kurniawan Khannedy Programmer Zaman Now";
        var pattern = Pattern.compile("[a-zA-Z]*a[a-zA-Z]*");
        var matcher = pattern.matcher(name);

        while (matcher.find()) {
            var result = matcher.group();
            System.out.println(result);
        }
    }
}
