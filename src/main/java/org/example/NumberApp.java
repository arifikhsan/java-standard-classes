package org.example;

@SuppressWarnings({"WrapperTypeMayBePrimitive", "unused"})
public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = intValue.doubleValue();
        Float floatValue = intValue.floatValue();

        String stringInteger = "1000";
        Integer integerValue = Integer.valueOf(stringInteger);
        int intValue2 = Integer.parseInt(stringInteger);

        System.out.println(intValue2);
    }
}
