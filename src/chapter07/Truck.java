package chapter07;

//Расширение класса Vehicle для создания специализированного класса Truck
class Truck extends Vehicle {
    private int cargocap; // грузоподъемность в фунтах

    // Конструктор класса Truck.
    Truck(int p, int f, int m, int c) {
    /*Инициализировать члены Vehicle с использованием конструктора Vehicle*/
        super(p, f, m);

        cargocap = c;
    }

    // Методы доступа для cargocap.
    int getCargo() { return cargocap; }
    void putCargo(int c) { cargocap = c; }
}
