package chapter07;

class TruckDemo {
    public static void main(String[] args) {

        // Сконструировать несколько объектов, представляющих грузовики.
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelNeeded(dist);
        System.out.println("Полуприцеп может перевезти " +
                semi.getCargo() + " фунтов.");
        System.out.println("Для поездки на расстояние " + dist +
                " миль полуприцепу требуется " +
                gallons + " галлонов топлива.\n");

        gallons = pickup.fuelNeeded(dist);
        System.out.println("Пикап может перевезти " + pickup.getCargo() +
                " фунтов.");
        System.out.println("Для поездки на расстояние " + dist +
                " миль пикапу требуется " +
                gallons + " галлонов топлива.");
    }
}
