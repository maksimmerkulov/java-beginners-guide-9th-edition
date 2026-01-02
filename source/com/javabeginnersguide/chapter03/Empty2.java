package com.javabeginnersguide.chapter03;

// Вынесение за пределы определения цикла еще одной части.
class Empty2 {
    public static void main(String[] args) {
        int i;

        i = 0;      // вынести инициализацию за пределы цикла
        for(; i < 10; ) {
            System.out.println("Pass #" + i);
            i++;    // инкрементировать переменную управления циклом
        }
    }
}
