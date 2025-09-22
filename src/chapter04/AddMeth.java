package chapter04;

class AddMeth {
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

        System.out.print("Минивэн может перевезти " + minivan.passengers +
                " пассажиров. ");
        minivan.range(); // отобразить дальность поездки для minivan

        System.out.print("Спортивный автомобиль может перевезти " +
                sportscar.passengers + " пассажиров. ");
        sportscar.range(); // отобразить дальность поездки для sportscar
    }
}
