package com.javabeginnersguide.chapter01;

/*
  Демонстрация использования оператора if.
  Назовите этот файл IfDemo.java.
*/
class IfDemo {
    public static void main(String[] args) {
        int a, b, c;

        a = 2;
        b = 3;

        if(a < b) System.out.println("Значение a меньше значения b");

        // Следующий оператор ничего не отобразит.
        if(a == b) System.out.println("Это вы не увидите");

        System.out.println();

        c = a - b;  // Переменная c содержит -1

        System.out.println("Переменная c содержит -1");
        if(c >= 0) System.out.println("Значение c неотрицательное");
        if(c < 0) System.out.println("Значение c отрицательное");

        System.out.println();

        c = b - a;  // Теперь переменная c содержит 1

        System.out.println("Переменная c содержит 1");
        if(c >= 0) System.out.println("Значение c неотрицательное");
        if(c < 0) System.out.println("Значение c отрицательное");
    }
}
