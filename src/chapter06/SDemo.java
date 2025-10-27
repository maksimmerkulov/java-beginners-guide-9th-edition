package chapter06;

class SDemo {
    public static void main(String[] args) {
        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();

        // Каждый объект имеет собственную копию переменной экземпляра.
        ob1.x = 10;
        ob2.x = 20;

        System.out.println("Разумеется, ob1.x и ob2.x " +
                "являются независимыми.");
        System.out.println("ob1.x: " + ob1.x +
                "\nob2.x: " + ob2.x);
        System.out.println();

        // Все объекты совместно используют одну копию статической переменной
        System.out.println("Статическая переменная y является общей.");
        StaticDemo.y = 19;
        System.out.println("Установка значения StaticDemo.y в 19.");

        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();

        StaticDemo.y = 100;
        System.out.println("Изменение значения StaticDemo.y на 100.");

        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();
    }
}
