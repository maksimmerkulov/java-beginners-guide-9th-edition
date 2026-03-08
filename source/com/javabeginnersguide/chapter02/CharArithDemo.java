package com.javabeginnersguide.chapter02;

// С символьными переменными можно обращаться как с целочисленными.
class CharArithDemo {
    public static void main(String[] args) {
        char ch;

        ch = 'X';
        System.out.println("ch содержит " + ch);

        ch++;       // инкрементирование ch

        System.out.println("ch теперь содержит " + ch);

        ch = 90;    // присваивание ch значения Z
        System.out.println("ch теперь содержит " + ch);
    }
}
