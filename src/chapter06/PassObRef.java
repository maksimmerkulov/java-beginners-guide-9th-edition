package chapter06;

class PassObRef {
    public static void main(String[] args) {
        Test2 ob = new Test2(15, 20);

        System.out.println("ob.a и ob.b перед вызовом: " +
                ob.a + " " + ob.b);

        ob.change(ob);

        System.out.println("ob.a и ob.b после вызова: " +
                ob.a + " " + ob.b);
    }
}
