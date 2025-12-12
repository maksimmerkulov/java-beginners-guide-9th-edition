package com.javabeginnersguide.chapter02;

/*
  Упражнение 2.1.
  Расчет расстояния до места вспышки молнии,
  звук которого был услышан через 7.2 секунды.
*/
class Sound {
    public static void main(String[] args) {
        double dist;

        dist = 7.2 * 335;

        System.out.println("Место вспышки молнии находится на расстоянии "
                + dist + " метров.");
    }
}
