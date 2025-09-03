package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long parsedInputAsLong = Long.parseLong(input);
        String result = "long";
        if (parsedInputAsLong <= Integer.MAX_VALUE && parsedInputAsLong >= Integer.MIN_VALUE) {
            result = "int";
        }
        if (parsedInputAsLong <= Short.MAX_VALUE && parsedInputAsLong >= Short.MIN_VALUE) {
            result = "short";
        }
        if (parsedInputAsLong <= Byte.MAX_VALUE && parsedInputAsLong >= Byte.MIN_VALUE) {
            result = "byte";
        }
        return result;
    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }

}
