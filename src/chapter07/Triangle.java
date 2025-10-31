package chapter07;

// Подкласс TwoDShape для представления треугольников.
class Triangle extends TwoDShape {
    String style;

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Стиль треугольника: " + style);
    }
}
