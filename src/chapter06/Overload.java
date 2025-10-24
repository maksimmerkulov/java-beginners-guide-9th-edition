package chapter06;

// Демонстрация перегрузки методов.
class Overload {
    void ovlDemo() {
        System.out.println("Без параметров");
    }

    // Перегруженная версия ovlDemo с одним параметром типа int.
    void ovlDemo(int a) {
        System.out.println("Один параметр типа int: " + a);
    }

    // Перегруженная версия ovlDemo с двумя параметрами типа int.
    int ovlDemo(int a, int b) {
        System.out.println("Два параметра типа int: " + a + " " + b);
        return a + b;
    }

    // Перегруженная версия ovlDemo с двумя параметрами типа double.
    double ovlDemo(double a, double b) {
        System.out.println("Два параметра типа double: " + a + " " + b);
        return a + b;
    }
}
