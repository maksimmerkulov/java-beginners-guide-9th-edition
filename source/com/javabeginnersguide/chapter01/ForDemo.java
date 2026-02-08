package com.javabeginnersguide.chapter01;

/*
  Демонстрация использования цикла for.
  Назовите этот файл ForDemo.java.
*/
class ForDemo {
    public static void main(String[] args) {
        int count;

        for(count = 0; count < 5; count++)
            System.out.println("Значение count: " + count);

        System.out.println("Готово!");
    }
}
