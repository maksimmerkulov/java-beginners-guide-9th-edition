package chapter07;

class Shapes6 {
    public static void main(String[] args) {
        ColorTriangle t1 = new ColorTriangle("синий", "контурный", 8.0, 12.0);
        ColorTriangle t2 = new ColorTriangle("красный", "закрашенный", 2.0, 2.0);

        System.out.println("Информация об объекте t1: ");
        t1.showStyle();
        t1.showDim();
        t1.showColor();
        System.out.println("Площадь: " + t1.area());

        System.out.println();

        System.out.println("Информация об объекте t2: ");
        t2.showStyle();
        t2.showDim();
        t2.showColor();
        System.out.println("Площадь: " + t2.area());
    }
}
