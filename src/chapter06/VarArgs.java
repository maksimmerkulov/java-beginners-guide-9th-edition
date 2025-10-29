package chapter06;

// Демонстрация использования аргумента переменной длины.
class VarArgs {

    // Метод vaTest() принимает аргумент переменной длины.
    static void vaTest(int ... v) {
        System.out.println("Количество аргументов: " + v.length);
        System.out.println("Содержимое: ");

        for(int i=0; i < v.length; i++)
            System.out.println("  аргумент " + i + ": " + v[i]);

        System.out.println();
    }

    public static void main(String[] args) {
        // Обратите внимание на то, что метод vaTest() можно вызывать
        // с переменным количеством аргументов.
        vaTest(10);      // один аргумент
        vaTest(1, 2, 3); // три аргумента
        vaTest();            // без аргументов
    }
}
