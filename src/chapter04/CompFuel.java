package chapter04;

class CompFuel {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        double gallons;
        int dist = 252;

        // Присвоить значения полям в minivan.
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Присвоить значения полям в sportscar.
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

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
