package com.javabeginnersguide.chapter01;

/*
  Демонстрация использования переменных.
  Назовите этот файл Example2.java.
*/
class Example2 {
    public static void main(String[] args) {
        int myVar1;     // объявление переменной
        int myVar2;     // объявление еще одной переменной

        myVar1 = 1024;  // присваивание переменной myVar1 значения 1024

        System.out.println("myVar1 содержит " + myVar1);

        myVar2 = myVar1 / 2;

        System.out.print("myVar2 содержит myVar1 / 2: ");
        System.out.println(myVar2);
    }
}
