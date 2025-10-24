package chapter06;

// Демонстрация перегрузки конструкторов.
class MyClass2 {
    int x;

    MyClass2() {
        System.out.println("Внутри MyClass2().");
        x = 0;
    }

    MyClass2(int i) {
        System.out.println("Внутри MyClass2(int).");
        x = i;
    }

    MyClass2(double d) {
        System.out.println("Внутри MyClass2(double).");
        x = (int) d;
    }

    MyClass2(int i, int j) {
        System.out.println("Внутри MyClass2(int, int).");
        x = i * j;
    }
}
