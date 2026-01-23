package com.javabeginnersguide.chapter05;

// Предотвращает деление на 0 с использованием операции ?.
class NoZeroDiv2 {
    public static void main(String[] args) {

        for(int i = -5; i < 6; i++)
            if(i != 0 ? true : false)
                System.out.println("100 / " + i + " равно " + 100 / i);
    }
}
