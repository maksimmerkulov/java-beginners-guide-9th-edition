package com.javabeginnersguide.chapter02;

// Демонстрация области видимости блока.
class ScopeDemo {
    public static void main(String[] args) {
        int x;          // переменная известна всему коду внутри main()

        x = 10;
        if(x == 10) {   // начало новой области видимости

            int y = 20; // переменная известна только этому блоку

            // Переменные x и y здесь известны.

            System.out.println("x и y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100; // Ошибка! Переменная y здесь неизвестна

        // Переменная x здесь по-прежнему известна.
        System.out.println("Значение x равно " + x);
    }
}
