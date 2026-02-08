package com.javabeginnersguide.chapter01;

/*
  Демонстрация использования блока кода.
  Назовите этот файл BlockDemo.java.
*/
class BlockDemo {
    public static void main(String[] args) {
        double i, j, d;
        i = 5;
        j = 10;

        // Целью оператора if является блок.
        if(i != 0) {
            System.out.println("Значение i не равно нулю.");
            d = j / i;
            System.out.println("Результат j / i равен " + d);
        }
    }
}
