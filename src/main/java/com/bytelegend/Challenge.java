package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(hello());
        System.out.println(add(40, 2));
    }

    public static void hello() {
        System.out.println("Hello");
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
