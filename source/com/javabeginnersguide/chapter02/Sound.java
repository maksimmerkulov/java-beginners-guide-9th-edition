package com.javabeginnersguide.chapter02;

/*
  Упражнение 2.1. Дополнительная задача.
  Расчет расстояния до объекта по времени прихода эхо,
  звук которого был услышан через 7.2 секунды.
*/
class Sound {
    public static void main(String[] args) {
        double dist;

        dist = (7.2 / 2) * 335;

        System.out.println("Объект находится на расстоянии "
                + dist + " метров.");
    }
}
