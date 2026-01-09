package com.javabeginnersguide.chapter04;

// Добавление конструктора.

class Vehicle {
    int passengers; // количество пассажиров
    int fuelcap;    // запас топлива в галлонах
    int mpg;        // расход топлива в милях на галлон

    // Конструктор для класса Vehicle.
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Возвращает дальность поездки.
    int range() {
        return mpg * fuelcap;
    }

    //Рассчитывает объем топлива, необходимого для поездки на заданное расстояние
    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }
}

class VehConsDemo {
    public static void main(String[] args) {
        // Создать объекты транспортных средств.
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportscar = new Vehicle(2, 14, 12);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelNeeded(dist);

        System.out.println("Для поездки на расстояние " + dist
                + " миль минивэну требуется "
                + gallons + " галлонов топлива.");

        gallons = sportscar.fuelNeeded(dist);

        System.out.println("Для поездки на расстояние " + dist
                + " миль спортивному автомобилю требуется "
                + gallons + " галлонов топлива.");
    }
}
