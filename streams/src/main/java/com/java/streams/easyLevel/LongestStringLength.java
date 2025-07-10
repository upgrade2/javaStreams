package com.java.streams.easyLevel;

import java.util.Arrays;
import java.util.Comparator;

public class LongestStringLength {
    public static void main(String[] args) {
        String s = "I am learning Stream API in Java.";

        String ans =Arrays.stream(s.split(" ")).max(Comparator.comparing(String::length)).get();

        System.out.println(ans);
    }
}
