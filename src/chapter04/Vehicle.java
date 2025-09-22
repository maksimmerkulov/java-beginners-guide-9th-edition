package chapter04;

// Использование возвращаемого значения.

class Vehicle {
    int passengers; // количество пассажиров
    int fuelcap;    // запас топлива в галлонах
    int mpg;        // расход топлива в милях на галлон

    // Возвращает дальность поездки.
    int range() {
        return mpg * fuelcap;
    }
}
