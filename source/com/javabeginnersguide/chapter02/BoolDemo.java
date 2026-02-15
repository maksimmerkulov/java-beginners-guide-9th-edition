package com.javabeginnersguide.chapter02;

// Демонстрация использования значений типа boolean.
class BoolDemo {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b равно " + b);
        b = true;
        System.out.println("b равно " + b);

        // Значение boolean может управлять оператором if.
        if(b) System.out.println("Данная строка кода выполняется.");

        b = false;
        if(b) System.out.println("Данная строка кода не выполняется.");

        // Результатом операции отношения является значение boolean.
        System.out.println("10 > 9 равно " + (10 > 9));
    }
}
