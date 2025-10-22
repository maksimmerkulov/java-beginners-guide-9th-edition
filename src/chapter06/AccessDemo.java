package chapter06;

class AccessDemo {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        /* Доступ к alpha разрешен только через его методы доступа. */
        ob.setAlpha(-99);
        System.out.println("ob.alpha: " + ob.getAlpha());

        // Получить доступ к alpha подобным образом нельзя:
        // ob.alpha = 10; // Неправильно, т.к. член
                          // alpha является закрытым.

        // Нормально, поскольку члены beta и gamma являются открытыми.
        ob.beta = 88;
        ob.gamma = 99;
    }
}
