package chapter06;

// Демонстрация использования класса Queue.
class QDemo2 {
    public static void main(String[] args) {
        // Создать пустую очередь из 10 элементов.
        Queue q1 = new Queue(10);
        char[] name = {'T', 'o', 'm'};
        // Создать очередь из массива.
        Queue q2 = new Queue(name);

        char ch;
        int i;

        // Поместить ряд символов в q1.
        for(i=0; i < 10; i++)
            q1.put((char) ('A' + i));

        // Создать очередь из другой очереди.
        Queue q3 = new Queue(q1);

        // Отобразить содержимое очередей.
        System.out.print("Содержимое q1: ");
        for(i=0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Содержимое q2: ");
        for(i=0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Содержимое q3: ");
        for(i=0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
    }
}
