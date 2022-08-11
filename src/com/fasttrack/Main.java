package com.fasttrack;

import java.util.regex.Pattern;

/*
1. Inlocuiti intr-un text toate cuvintele care incep cu "m" si se termina cu "e".

2. Verificati ca un String e un double si poate fi convertit intr-un Double.
 */
public class Main {
    public static void main(String[] args) {
        String text = "Ana are mere, mare, mere.";
        String text1  = "An2a are mer$e, m5re, mere.";
        String numbers = "23634752";
        String numbers1 = "36246.32";
        String numbers2 = "8457.2345090928";

        System.out.println("Certain words replaced with '*':");
        System.out.println(replaceWords(text));

        System.out.println("\nShould return false:");
        System.out.println(isDouble(text));
        System.out.println(isDouble(text1));
        System.out.println(isDouble(numbers));
        System.out.println(isDouble(numbers1));
        System.out.println("Should return true:");
        System.out.println(isDouble(numbers2));
    }

    public static String replaceWords(String text) {
        return text.replaceAll("m[^ ]*e", "*");
    }

    public static boolean isDouble(String string) {
        return Pattern.matches("\\d*\\.\\d{6,14}", string);
    }
}