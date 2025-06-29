package com.javabeginnersguide.chapter05;

/*
  Упражнение 5.2.

  Класс очереди для символов.
*/
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

// Демонстрация использования класса Queue.
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
    }
}
