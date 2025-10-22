package chapter06;

class CallByValue {
    public static void main(String[] args) {
        Test1 ob = new Test1();

        int a = 15, b = 20;

        System.out.println("a и b перед вызовом: " +
                a + " " + b);

        ob.noChange(a, b);

        System.out.println("a и b после вызова: " +
                a + " " + b);
    }
}
