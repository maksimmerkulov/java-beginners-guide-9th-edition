package chapter06;

class OverloadDemo {
    public static void main(String[] args) {
        Overload ob = new Overload();
        int resI;
        double resD;

        // Вызвать все версии ovlDemo().
        ob.ovlDemo();
        System.out.println();
        ob.ovlDemo(2);
        System.out.println();
        resI = ob.ovlDemo(4, 6);
        System.out.println("Результат вызова ob.ovlDemo(4, 6): " + resI);
        System.out.println();
        resD = ob.ovlDemo(1.1, 2.32);
        System.out.println("Результат вызова ob.ovlDemo(1.1, 2.32): " + resD);
    }
}
