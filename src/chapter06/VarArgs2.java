package chapter06;

//Использование аргумента переменной длины вместе со стандартными аргументами
class VarArgs2 {
    // Здесь msg - нормальный параметр, а v - параметр переменной длины.
    static void vaTest(String msg, int ... v) {
        System.out.println(msg + v.length);
        System.out.println("Содержимое: ");

        for(int i=0; i < v.length; i++)
            System.out.println("  аргумент " + i + ": " + v[i]);

        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("Один аргумент в параметре переменной длины: ", 10);
        vaTest("Три аргумента в параметре переменной длины: ", 1, 2, 3);
        vaTest("Без аргументов в параметре переменной длины: ");
    }
}
