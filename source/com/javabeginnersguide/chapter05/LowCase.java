package com.javabeginnersguide.chapter05;

// Буквы нижнего регистра.
class LowCase {
    public static void main(String[] args) {
        char ch;

        for(int i=0; i < 10; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch);

            // Этот оператор включает бит 6.
            ch = (char) ((int) ch | 32); //теперь ch содержит букву нижнего регистра

            System.out.print(ch + " ");
        }
    }
}
