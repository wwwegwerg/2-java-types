package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long parsedInputAsLong = Long.parseLong(input);
        if (parsedInputAsLong <= Byte.MAX_VALUE && parsedInputAsLong >= Byte.MIN_VALUE) {
            return "byte";
        }
        if (parsedInputAsLong <= Short.MAX_VALUE && parsedInputAsLong >= Short.MIN_VALUE) {
            return "short";
        }
        if (parsedInputAsLong <= Integer.MAX_VALUE && parsedInputAsLong >= Integer.MIN_VALUE) {
            return "int";
        }
        return "long";

    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }

}
