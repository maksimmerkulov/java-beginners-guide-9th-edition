package chapter06;

// Добавление версии f(byte).
class Overload2 {
    void f(byte x) {
        System.out.println("Внутри f(byte): " + x);
    }

    void f(int x) {
        System.out.println("Внутри f(int): " + x);
    }

    void f(double x) {
        System.out.println("Внутри f(double): " + x);
    }
}
