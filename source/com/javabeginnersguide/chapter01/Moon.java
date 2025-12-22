package com.javabeginnersguide.chapter01;

/*
  Расчет вашего фактического веса на Луне.
  Назовите этот файл Moon.java.
*/
class Moon {
    public static void main(String[] args) {
        double earthweight;     // вес на Земле
        double moonweight;      // вес на Луне

        earthweight = 165;

        moonweight = earthweight * 0.17;

        System.out.println("Ваш вес " + earthweight +
                " в земных фунтах эквивалентен весу " +
                moonweight + " в лунных фунтах.");
    }
}
