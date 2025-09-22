package chapter04;

class RetMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        // Присвоить значения полям в minivan.
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Присвоить значения полям в sportscar.
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        // Получить дальность поездки для разных транспортных средств.
        range1 = minivan.range();
        range2 = sportscar.range();

        System.out.println("Минивэн может перевезти " + minivan.passengers +
                " пассажиров на расстояние " + range1 + " миль.");

        System.out.println("Спортивный автомобиль может перевезти " +
                sportscar.passengers +
                " пассажиров на расстояние " + range2 + " миль.");
    }
}
