package chapter06;

// Сравнение открытого и закрытого доступа.
class MyClass {
    private int alpha; // закрытый доступ
    public int beta;   // открытый доступ
    int gamma;         // стандартный доступ

    /* Методы доступа к alpha. Член класса может получать
       доступ к закрытому члену того же класса. */
    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }
}
