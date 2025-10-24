package chapter06;

class TypeConv {
    public static void main(String[] args) {
        Overload2 ob = new Overload2();

        int i = 10;
        double d = 10.1;

        byte b = 99;
        short s = 10;
        float f = 11.5F;

        ob.f(i); // вызывается ob.f(int)
        ob.f(d); // вызывается ob.f(double)
        ob.f(b); // вызывается ob.f(byte) без преобразования типа
        ob.f(s); // вызывается ob.f(int) с преобразованием типа
        ob.f(f); // вызывается ob.f(double) с преобразованием типа
    }
}
