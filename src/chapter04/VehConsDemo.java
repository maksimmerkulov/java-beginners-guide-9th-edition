package chapter04;

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
