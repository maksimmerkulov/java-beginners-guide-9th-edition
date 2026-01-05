package com.javabeginnersguide.chapter04;

// Программа, в которой используется класс Vehicle.
class Vehicle {
    int passengers; // количество пассажиров
    int fuelcap;    // запас топлива в галлонах
    int mpg;        // расход топлива в милях на галлон
}
// В этом классе объявляется объект типа Vehicle.
class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;

        // Присвоить значения полям в minivan.
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Рассчитать дальность при полном баке.
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Минивэн может перевезти " + minivan.passengers +
                " пассажиров на расстояние " + range + " миль.");
    }
}
