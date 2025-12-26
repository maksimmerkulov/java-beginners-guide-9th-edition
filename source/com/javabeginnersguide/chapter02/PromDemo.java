package com.javabeginnersguide.chapter02;

// Неожиданное повышение типов!
class PromDemo {
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        i = b * b;  // Нормально, в приведении нет нужды.

        b = 10;
        b = (byte) (b * b); // Требуется приведение!

        System.out.println("i и b: " + i + " " + b);
    }
}
