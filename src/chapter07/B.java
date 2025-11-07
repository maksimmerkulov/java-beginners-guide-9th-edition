package chapter07;

// Создать подкласс, расширив класс A.
class B extends A {
    int i; // этот член i скрывает член i в A

    B(int a, int b) {
        super.i = a; // i в A
        i = b;       // i в B
    }
    void show() {
        System.out.println("i в суперклассе: " + super.i);
        System.out.println("i в подклассе: " + i);
    }
}
