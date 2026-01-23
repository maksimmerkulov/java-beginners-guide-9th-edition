package com.javabeginnersguide.chapter05;

// Демонстрация работы операции побитового НЕ.
class NotDemo {
    public static void main(String[] args) {
        byte b = -34;

        for(int t=128; t > 0; t = t/2) {
            if((b & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
        System.out.println();

        // Изменить состояние всех битов на противоположное.
        b = (byte) ~b;

        for(int t=128; t > 0; t = t/2) {
            if((b & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }
}
