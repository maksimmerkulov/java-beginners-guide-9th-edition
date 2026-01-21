package com.javabeginnersguide.chapter05;

// Знакомство с классом String.
class StringDemo {
    public static void main(String[] args) {
        // Разные способы объявления строк.
        String str1 = new String("Строки в Java являются объектами.");
        String str2 = "Они создаются различными способами.";
        String str3 = new String(str2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
