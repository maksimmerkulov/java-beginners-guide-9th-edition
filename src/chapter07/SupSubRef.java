package chapter07;

class SupSubRef {
    public static void main(String[] args) {
        X x = new X(10);
        X x2;
        Y y = new Y(5, 6);

        x2 = x; // Нормально, типы одинаковы.
        System.out.println("x2.a: " + x2.a);

        x2 = y; // Тоже нормально, поскольку класс Y
                // является производным от X.
        System.out.println("x2.a: " + x2.a);

        // Ссылкам X известны только члены X.
        x2.a = 19;    // Нормально.
        // x2.b = 27; // Ошибка, член b в X отсутствует.
    }
}
