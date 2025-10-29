package chapter06;

// Демонстрация использования класса Stack.
class SDemo4 {
    public static void main(String[] args) {
        // Создать пустой стек из 10 элементов.
        Stack stk1 = new Stack(10);

        char[] name = {'T', 'o', 'm'};

        // Создать стек из массива.
        Stack stk2 = new Stack(name);

        char ch;
        int i;

        // Поместить несколько символов в stk1.
        for(i=0; i < 10; i++)
            stk1.push((char) ('A' + i));

        // Создать стек из другого стека.
        Stack stk3 = new Stack(stk1);

        // Отобразить содержимое стеков.
        System.out.print("Содержимое stk1: ");
        for(i=0; i < 10; i++) {
            ch = stk1.pop();
            System.out.print(ch);
        }
        System.out.println("\n");
        System.out.print("Содержимое stk2: ");
        for(i=0; i < 3; i++) {
            ch = stk2.pop();
            System.out.print(ch);
        }
        System.out.println("\n");
        System.out.print("Содержимое stk3: ");
        for(i=0; i < 10; i++) {
            ch = stk3.pop();
            System.out.print(ch);
        }
    }
}
