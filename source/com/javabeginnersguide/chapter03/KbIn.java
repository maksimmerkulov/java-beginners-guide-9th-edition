package com.javabeginnersguide.chapter03;

// Чтение символа с клавиатуры.
class KbIn {
    public static void main(String[] args)
            throws java.io.IOException {

        char ch;

        System.out.print("Нажмите клавишу и затем ENTER: ");

        ch = (char) System.in.read();  // получить символ

        System.out.println("Была нажата клавиша: " + ch);
    }
}
