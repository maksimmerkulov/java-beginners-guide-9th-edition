package com.javabeginnersguide.chapter05;

/*
  Упражнение 5.2. Дополнительная задача.

  Классы очереди для символов, целых и вещественных чисел.
*/

// Класс очереди для символов.
class Queue {
    char[] q;           // массив, хранящий данные очереди
    int putloc, getloc; // индексы для позиций помещения и извлечения

    Queue(int size) {
        q = new char[size]; // выделение памяти под очередь
        putloc = getloc = 0;
    }

    // Поместить символ в очередь.
    void put(char ch) {
        if(putloc==q.length) {
            System.out.println(" - Очередь переполнена.");
            return;
        }

        q[putloc++] = ch;
    }

    // Извлечь символ из очереди.
    char get() {
        if(getloc == putloc) {
            System.out.println(" - Очередь пуста.");
            return (char) 0;
        }

        return q[getloc++];
    }
}

// Класс очереди для целых чисел.
class IntQueue {
    int[] q;            // массив, хранящий данные очереди
    int putloc, getloc; // индексы для позиций помещения и извлечения

    IntQueue(int size) {
        q = new int[size];  // выделение памяти под очередь
        putloc = getloc = 0;
    }

    // Поместить число в очередь.
    void put(int value) {
        if(putloc==q.length) {
            System.out.println(" - Очередь переполнена.");
            return;
        }

        q[putloc++] = value;
    }

    // Извлечь число из очереди.
    int get() {
        if(getloc == putloc) {
            System.out.println(" - Очередь пуста.");
            return 0;
        }

        return q[getloc++];
    }
}

// Класс очереди для вещественных чисел.
class DoubleQueue {
    double[] q;         // массив, хранящий данные очереди
    int putloc, getloc; // индексы для позиций помещения и извлечения

    DoubleQueue(int size) {
        q = new double[size];   // выделение памяти под очередь
        putloc = getloc = 0;
    }

    // Поместить число в очередь.
    void put(double value) {
        if(putloc==q.length) {
            System.out.println(" - Очередь переполнена.");
            return;
        }

        q[putloc++] = value;
    }

    // Извлечь число из очереди.
    double get() {
        if(getloc == putloc) {
            System.out.println(" - Очередь пуста.");
            return 0.0;
        }

        return q[getloc++];
    }
}

// Демонстрация использования всех очередей
class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Использование bigQ для сохранения алфавита.");
        // Поместить в bigQ коды букв.
        for(i=0; i < 26; i++)
            bigQ.put((char) ('A' + i));

        // Извлечь и отобразить элементы bigQ.
        System.out.print("Содержимое bigQ: ");
        for(i=0; i < 26; i++) {
            ch = bigQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }

        System.out.println("\n");

        System.out.println("Использование smallQ для генерации ошибок.");
        // Использовать smallQ для генерации ошибок.
        for(i=0; i < 5; i++) {
            System.out.print("Попытка сохранения " +
                    (char) ('Z' - i));

            smallQ.put((char) ('Z' - i));

            System.out.println();
        }
        System.out.println();

        // Дополнительные ошибки в smallQ.
        System.out.print("Содержимое smallQ: ");
        for(i=0; i < 5; i++) {
            ch = smallQ.get();

            if(ch != (char) 0) System.out.print(ch);
        }

        System.out.println("\n");

        // Int Queue
        IntQueue intQ = new IntQueue(5);
        int value;

        System.out.println("Использование intQ для сохранения целых чисел.");
        // Поместить в intQ целые числа.
        for(i = 1; i <= 5; i++) {
            System.out.print("Попытка сохранения " + (i * 10));
            intQ.put(i * 10);
            System.out.println();
        }

        // Извлечь и отобразить элементы intQ.
        System.out.print("Содержимое intQ: ");
        for(i = 0; i < 5; i++) {
            value = intQ.get();
            if(value != 0) System.out.print(value + " ");
        }

        System.out.println("\n");

        // Double Queue
        DoubleQueue doubleQ = new DoubleQueue(5);
        double dValue;

        System.out.println("Использование doubleQ для сохранения вещественных чисел.");
        // Поместить в doubleQ вещественные числа.
        for(i = 0; i < 5; i++) {
            dValue = i + 0.5;
            System.out.print("Попытка сохранения " + dValue);
            doubleQ.put(dValue);
            System.out.println();
        }

        // Извлечь и отобразить элементы doubleQ.
        System.out.print("Содержимое doubleQ: ");
        for(i = 0; i < 5; i++) {
            dValue = doubleQ.get();
            if(dValue != 0.0) System.out.print(dValue + " ");
        }

        System.out.println("\n");
    }
}
